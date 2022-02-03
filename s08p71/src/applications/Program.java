package applications;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double cotacao=CurrencyConverter.dollarPrice(sc);
		System.out.print("How many Dollars will be bought? ");
		double quantia=sc.nextDouble();
		System.out.printf("Amount to be paid in Reais = %.2f",CurrencyConverter.finalPrice(quantia, cotacao));
		
		sc.close();
	}

}
