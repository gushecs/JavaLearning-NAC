package entities;

public abstract class TaxPayer {

	public String name;
	protected Double anualIncome;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getAnualIncome() {
		return anualIncome;
	}
	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	public TaxPayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}
	public TaxPayer() {
	}
	public abstract double calculateTax();
	
}
