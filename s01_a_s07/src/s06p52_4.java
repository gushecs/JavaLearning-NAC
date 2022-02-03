import java.util.Scanner;

public class s06p52_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x,y;
		int N = sc.nextInt();
		
		for (int i=1;i<=N;i++) {
			x=sc.nextInt();
			y=sc.nextInt();
			
			if (y!=0)
				System.out.println((double) x/y);
			else
				System.out.println("divisao impossivel");
		}
		
		sc.close();
	}

}
