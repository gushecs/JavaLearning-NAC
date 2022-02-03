import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle x=new Rectangle();
		
		x.readRectangle(sc);
		System.out.println(x);

	}

}
