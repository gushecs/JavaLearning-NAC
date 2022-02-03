package util;

import java.util.Scanner;

public class CurrencyConverter {
	
	public static final double dollarPrice(Scanner sc) {
		System.out.print("What is the Dollar price? ");
		return sc.nextDouble();
	}
	
	public static double finalPrice(double amount,double dollarPrice) {
		return (amount*dollarPrice)*1.06;
	}
}
