import java.util.Scanner;

public class s06p52_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		for (int i=N;i>=1;i--) {
			if (N%i==0)
				System.out.println(N/i);
		}
		
		sc.close();
	}

}
