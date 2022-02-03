package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		Student x=new Student();
		x.readStudent(sc);
		System.out.print(x);
		
		sc.close();
	}

}
