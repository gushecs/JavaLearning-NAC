import java.util.Scanner;

public class s06p47_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int senha;
		
		do {
			
			senha=sc.nextInt();
			if (senha != 2002)
				System.out.println("Senha Invalida");
			else
				System.out.println("Acesso Permitido");
			
		} while (senha != 2002);
		
		sc.close();
	}

}
