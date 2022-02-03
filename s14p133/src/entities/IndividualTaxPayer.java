package entities;

public class IndividualTaxPayer extends TaxPayer {

	private double healthExpendures;

	public double getHealthExpendures() {
		return healthExpendures;
	}

	public void setHealthExpendures(double healthExpendures) {
		this.healthExpendures = healthExpendures;
	}

	public IndividualTaxPayer(String name, Double anualIncome, double healthExpendures) {
		super(name, anualIncome);
		this.healthExpendures = healthExpendures;
	}
	
	public IndividualTaxPayer() {}

	@Override
	public double calculateTax() {
		if (this.anualIncome<20000) {
			if (.5*healthExpendures<.15*anualIncome)
				return .15*anualIncome-.5*healthExpendures;
			else
				return 0;
		}	
		else {
			if (.5*healthExpendures<.25*anualIncome)
				return .25*anualIncome-.5*healthExpendures;
			else
				return 0;
		}
	}
	
}
