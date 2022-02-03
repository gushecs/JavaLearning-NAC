import java.util.Locale;
import java.util.Scanner;

public class s04p28_6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		double A,B,C,triangulo,circulo,trapezio,quadrado,retangulo;
		double pi=3.14159;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangulo=A*C/2.0;
		circulo=pi*Math.pow(C, 2.0);
		trapezio=(A+B)*C/2.0;
		quadrado=Math.pow(B, 2.0);
		retangulo=A*B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();
	}

}