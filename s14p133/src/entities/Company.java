package entities;

public class Company extends TaxPayer{

	private int numberOfEmployees;

	public double getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public Company(String name, Double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Company() {}
	
	@Override
	public double calculateTax() {
		if (numberOfEmployees>10)
			return anualIncome*.14;
		else
			return anualIncome*.16;
	}
	
}
