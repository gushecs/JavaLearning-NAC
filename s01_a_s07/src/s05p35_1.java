import java.util.Scanner;

public class s05p35_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x = (sc.nextInt()<0) ? "NEGATIVO" : "NÃO NEGATIVO";
		System.out.printf("%s", x);
		
		sc.close();

	}

}
