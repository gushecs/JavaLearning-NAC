import java.util.Locale;
import java.util.Scanner;

public class s05p35_8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		String is="Isento";
		double imposto=0.0;
		double i28,i18,i8;
		
		i28=(x-4500>0) ? x-4500:0;
		
		i18=x-3000;
		if (i18>1500)
			i18=1500;
		else if (i18<0)
			i18=0;
		
		i8=x-2000;
		if (i8>1000)
			i8=1000;
		else if (i8<0)
			i8=0;
		
		imposto += i8*0.08+i18*0.18+i28*0.28;
		
		if (imposto==0)
			System.out.println(is);
		else
			System.out.printf("R$ %.2f",imposto);
		
		sc.close();
	}

}
