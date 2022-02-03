import java.util.Scanner;

public class s05p35_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z;
		
		if (x>=y) {
			z=24-x+y;
		}
		else {
			z=y-x;
		}
		
		System.out.println("O JOGO DUROU "+z+" HORA(S)");
		
		sc.close();
	}

}
