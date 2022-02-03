import java.util.Scanner;

public class s05p35_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x = (sc.nextInt()%2!=0) ? "ÍMPAR":"PAR";
		System.out.println(x);
		
		sc.close();

	}

}
