package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> listOfEmployees = new ArrayList();
		
		System.out.print("Enter the number of employees: ");
		Integer quantityEmployees = sc.nextInt();
		
		for (int i = 1; i <= quantityEmployees; i++) {
			
			System.out.println("Employee #" + i + " data:");
			
			System.out.print("Outsourced (y/n)?");
			Character opt = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			Employee employee;
			
			if(opt.equals('y')) {
				
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				
				employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
			} else {
				employee = new Employee(name, hours, valuePerHour);
			}
			
			listOfEmployees.add(employee);
		}
		
		System.out.println("PAYMENTS: ");
		for (Employee employee : listOfEmployees) {
			System.out.println(employee);
		}
		
		sc.close();
	}

}
