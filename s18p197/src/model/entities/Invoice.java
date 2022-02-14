package model.entities;

import java.util.Calendar;
import java.util.Date;

public class Invoice {
	
	private double fee;
	private double tax;
	private Date date;
	private double value;
	private int installments;
	
	public Invoice(double fee, double tax, Date date, double value) {
		super();
		this.fee = fee;
		this.tax = tax;
		this.date = date;
		this.value = value;
		installments=1;
	}
	
	public void setInstallments(int installments) {
		this.installments=installments;
	}
	
	public double installmentValue(int installment) {
		return ((value/installments)*(1+fee*installment))*(1+tax);
	}
	
	public Date installmentDate(int installment) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, installment);
		return cal.getTime();
	}

}
