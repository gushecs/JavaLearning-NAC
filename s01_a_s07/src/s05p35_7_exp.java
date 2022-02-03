import java.util.Locale;
import java.util.Scanner;

public class s05p35_7_exp {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);

		double x = NumberCase(1,sc);
		double y = NumberCase(1,sc);
		String z;

		if (x == 0 && y == 0)
			z = "Origem";
		else if (x == 0 && y != 0)
			z = "Eixo Y";
		else if (x != 0 && y == 0)
			z = "Eixo X";
		else if (x < 0 && y > 0)
			z = "Q2";
		else if (x > 0 && y > 0)
			z = "Q1";
		else if (x < 0 && y < 0)
			z = "Q3";
		else
			z = "Q4";

		System.out.println(z);
		sc.close();
	}

	public static double NumberCase(int cases,Scanner sc) {

		Locale.setDefault(Locale.US);
		String cd;
		double num=0.0;
		int i=1;

		if (cases == 1)
			cd = " casa decimal.";
		else
			cd = " casas decimais.";

		while (i == 1) {
			System.out.println("Digite um número com " + cases + cd);
			num = sc.nextDouble();
			String numEmString = Double.toString(num);
			int posPonto = numEmString.indexOf(".");
			posPonto += 1;
			String numDecimais = numEmString.substring(posPonto);
			int lengthNumDecimais = numDecimais.length();
			if (lengthNumDecimais != cases)
				System.out.println("Número inválido!");
			else
				i=0;
		}
		return num;
	}

}
