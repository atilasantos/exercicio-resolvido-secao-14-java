package entities;

public class OutsourcedEmployee extends Employee {

	private Double additionalCharge;
	
	public OutsourcedEmployee () {}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHours, Double additionalCharge) {
		super(name, hours, valuePerHours);
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public final Double payment() {
		Double outsourcedPayment = super.payment() + (additionalCharge * 1.1);
		return outsourcedPayment;
	}
}
