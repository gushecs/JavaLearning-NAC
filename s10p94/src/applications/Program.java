package applications;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int id,increaseId,alfa=0;
		String name;
		double salary,increase;
		List<Employee> employees=new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			name=sc.nextLine();
			System.out.print("Salary: ");
			salary=sc.nextDouble();
			employees.add(new Employee(id,name,salary));
			System.out.println();
		}
		
		System.out.print("Enter the employee id that will have a salary increase: ");
		increaseId=sc.nextInt();
		for (Employee e:employees) {
			if (increaseId==e.getId()) {
				System.out.print("Enter the percentage: ");
				increase=sc.nextDouble();
				e.increaseSalary(increase);
				alfa=1;
			}
		}
		if (alfa==0)
			System.out.println("This id does not exist!");
		System.out.println();
		
		System.out.println("List of employees:");
		for (Employee e:employees)
			System.out.println(e);

		sc.close();

	}

}
