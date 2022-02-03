import java.util.Scanner;

public class s06p52_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.printf("%d %d %d%n",i,(int)Math.pow(i, 2),(int)Math.pow(i, 3));
		}

		sc.close();
	}

}
