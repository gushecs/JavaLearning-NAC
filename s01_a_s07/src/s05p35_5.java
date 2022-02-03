import java.util.Locale;
import java.util.Scanner;

public class s05p35_5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod=sc.nextInt();
		int quant=sc.nextInt();
		double preco=0.0;
		
		switch (cod) {
		case 1:
			preco=quant*4.0;
			break;
		case 2:
			preco=quant*4.5;
			break;
		case 3:
			preco=quant*5.0;
			break;
		case 4:
			preco=quant*2.0;
			break;
		case 5:
			preco=quant*1.5;
			break;
		}
		
		System.out.printf("Total: R$ %.2f",preco);
		sc.close();
	}

}
