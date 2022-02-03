import java.util.Locale;
import java.util.Scanner;

public class s06p52_3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x,y,z,m;
		int N=sc.nextInt();
		
		for (int i=1;i<=N;i++) {
			x=sc.nextDouble();
			y=sc.nextDouble();
			z=sc.nextDouble();
			
			m=(2*x+3*y+5*z)/10;
			System.out.printf("%.1f%n",m);
		}
		
		sc.close();
	}

}
