package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		System.out.print("Enter salary: ");
		double income = sc.nextDouble();
		sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Employee> employees = new ArrayList<>();
			String data = br.readLine();
			while (data != null) {
				String[] info = data.split(",");
				employees.add(new Employee(info[0], info[1], Double.parseDouble(info[2])));
				data = br.readLine();
			}

			System.out.println("Email of people whose salary is more than " + String.format("%.2f", income) + ":");

			employees.stream().filter(x -> x.getIncome() > income)
			.map(x -> x.getEmail())
					.sorted((x, y) -> x.toUpperCase().compareTo(y.toUpperCase()))
					.collect(Collectors.toList())
					.forEach(System.out::println);
			
			System.out.print("Sum of salary of people whose name starts with 'M': ");
			
			System.out.print(String.format("%.2f",employees.stream()
					.filter(x -> x.getName().charAt(0)=='M')
			.mapToDouble(x -> x.getIncome())
			.reduce(0,(x,y) -> x+y)));

		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			sc.close();
		}

	}

}
