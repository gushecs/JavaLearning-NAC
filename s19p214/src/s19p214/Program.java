package s19p214;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Integer> allStudents = new HashSet<>();
		List<String> courses = new ArrayList<>();
		courses.add("A");
		courses.add("B");
		courses.add("C");

		for (int i = 0; i < courses.size(); i++) {
			System.out.print("How many students for course "+courses.get(i)+"? ");
			int sic = sc.nextInt();
			sc.nextLine();
			Set<Integer> students = new HashSet<>();
			for (int j = 0; j<sic; j++) {
				int student=sc.nextInt();
				sc.nextLine();
				students.add(student);
			}
			allStudents.addAll(students);
		}
		
		System.out.println("Total Students: "+allStudents.size());

		sc.close();

	}

}
