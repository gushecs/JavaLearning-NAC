import java.util.Locale;
import java.util.Scanner;

public class s04p28_5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1,cod2,n1,n2;
		double value1,value2,price;
		
		cod1=sc.nextInt();
		n1=sc.nextInt();
		value1=sc.nextDouble();
		cod2=sc.nextInt();
		n2=sc.nextInt();
		value2=sc.nextDouble();
		price=n1*value1+n2*value2;
		System.out.printf("VALOR A PAGAR: R$ %.2f",price);
		
		sc.close();

	}

}
