package entities;

public class Employee {
	
	private String name;
	private String email;
	private double income;
	
	public Employee(String name, String email, double income) {
		this.name = name;
		this.email = email;
		this.income = income;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public double getIncome() {
		return income;
	}

}
