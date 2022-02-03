import java.util.Locale;
import java.util.Scanner;

public class s04p28_4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number,time;
		double value,salary;
		
		number=sc.nextInt();
		time=sc.nextInt();
		value=sc.nextDouble();
		salary=time*value;
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f",salary);
		
		sc.close();
	}

}
