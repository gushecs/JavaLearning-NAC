package entities;

import java.util.Scanner;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto-imposto;
	}
	
	public void aumentarSalario(Scanner sc) {
		System.out.print("Which percentage to increase salary? ");
		double aumento=sc.nextDouble();
		salarioBruto *= 1+(aumento/100);
		System.out.println();
	}
	
	public String toString() {
		return nome+", $ "+String.format("%.2f%n", salarioLiquido());
	}
	
	public void lerFuncionario(Scanner sc) {
		System.out.print("Name: ");
		nome=sc.nextLine();
		System.out.print("Gross salary: ");
		salarioBruto=sc.nextDouble();
		System.out.print("Tax: ");
		imposto=sc.nextDouble();
		System.out.println();
	}

}
