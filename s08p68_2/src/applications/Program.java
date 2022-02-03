package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		Funcionario x = new Funcionario();
		x.lerFuncionario(sc);
		System.out.println("Employee: "+x);
		x.aumentarSalario(sc);
		System.out.println("Updated data: "+x);
		
		sc.close();
	}

}
