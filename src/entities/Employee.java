package entities;

public class Employee {

	protected String name;
	private Integer hours;
	private Double valuePerHours;
	
	public Employee() {}
	
	public Employee(String name, Integer hours, Double valuePerHours) {
		super();
		this.name = name;
		this.hours = hours;
		this.valuePerHours = valuePerHours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHours() {
		return valuePerHours;
	}

	public void setValuePerHours(Double valuePerHours) {
		this.valuePerHours = valuePerHours;
	}
	
	public Double payment() {
		return hours * valuePerHours;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(name + " - $ ");
		sb.append(String.format("%.2f",payment()));
		return sb.toString();
	}
	
}
