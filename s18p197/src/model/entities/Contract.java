package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.paymentServices.PaymentService;

public class Contract {
	
	private int number;
	private Invoice invoice;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Contract(int number, Date date, double value, PaymentService paymentService) {
		
		this.number = number;
		this.invoice = new Invoice(paymentService.serviceFee(),paymentService.serviceTax(),date,value);
	}
	
	public void getInvoice(int installments) {
		invoice.setInstallments(installments);
		for (int i=1;i<=installments;i++) {
			double installmentValue = invoice.installmentValue(i);
			Date dateValue = invoice.installmentDate(i);
			System.out.println(sdf.format(dateValue)+" - "+String.format("%.2f", installmentValue));
		}
	}
	
}
