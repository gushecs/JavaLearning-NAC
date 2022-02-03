import java.util.Locale;
import java.util.Scanner;

public class s05p35_6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		String y;

		if (x >= 0 && x <= 25) {
			y = "Intervalo [0,25]";
		} else if (x > 25 && x <= 50) {
			y = "Intervalo (25,50]";
		} else if (x > 50 && x <= 75) {
			y = "Intervalo (50,75]";
		} else if (x > 75 && x <= 100) {
			y = "Intervalo (75,100]";
		} else {
			y = "Fora de intervalo";
		}
		
		System.out.println(y);
		sc.close();
	}

}
