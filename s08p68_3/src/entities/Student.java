package entities;

import java.util.Scanner;

public class Student {
	
	public String name;
	public double grade1,grade2,grade3;
	
	public void readStudent(Scanner sc) {
		System.out.print("Name: ");
		name=sc.nextLine();
		System.out.print("First grade: ");
		grade1=sc.nextDouble();
		System.out.print("Second grade: ");
		grade2=sc.nextDouble();
		System.out.print("Third grade: ");
		grade3=sc.nextDouble();
		System.out.println();
	}
	
	public double mean() {
		return grade1+grade2+grade3;
	}
	
	public String toString() {
		String evaluatedMean;
		if (mean()>=60)
			evaluatedMean="PASS";
		else
			evaluatedMean="FAILED"+String.format("%nMISSING %.2f POINTS", 60-mean());
		
		return String.format("FINAL GRADE = %.2f%n", mean())+evaluatedMean;
	}

}
