import java.util.Locale;
import java.util.Scanner;

public class s05p35_7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		String z;
		
		if (x==0 && y==0) 
			z="Origem";
		else if (x==0 && y!=0)
			z="Eixo Y";
		else if (x!=0 && y==0)
			z="Eixo X";
		else if (x<0 && y>0)
			z="Q2";
		else if (x>0 && y>0)
			z="Q1";
		else if (x<0 && y<0)
			z="Q3";
		else
			z="Q4";
		
		System.out.println(z);		
		sc.close();
	}

}
