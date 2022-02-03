import java.util.Scanner;

public class s06p52_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		if (N==0)
			N=1;
		
		for (int i=N-1;i>=1;i--) {
			N*=i;
		}
		
		System.out.println(N);
		sc.close();
	}

}
