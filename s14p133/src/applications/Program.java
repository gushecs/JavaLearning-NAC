package applications;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.IndividualTaxPayer;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		List<TaxPayer> taxPayerList=new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int number=sc.nextInt();
		
		for (int i=1;i<=number;i++) {
			System.out.println("Tax payer #"+i+" data:");
			System.out.print("individual or company? (i/c) ");
			char type=sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome=sc.nextDouble();
			if (type=='i') {
				System.out.print("Health expendures: ");
				double healthExpendures=sc.nextDouble();
				taxPayerList.add(new IndividualTaxPayer(name,anualIncome,healthExpendures));
			}
			else {
				System.out.print("Number of employees: ");
				int numberOfEmployees=sc.nextInt();
				taxPayerList.add(new Company(name,anualIncome,numberOfEmployees));
			}
		}
		
		double totalTax=0;
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer taxPayer:taxPayerList) {
			System.out.println(taxPayer.name+": $ "+String.format("%.2f", taxPayer.calculateTax()));
			totalTax+=taxPayer.calculateTax();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ "+String.format("%.2f", totalTax));
		
		sc.close();
	}

}
