import java.util.Scanner;

public class s06p52_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x,in=0,out=0;
		int N=sc.nextInt();
		
		for (int i=1;i<=N;i++) {
			x=sc.nextInt();
			
			if (x>=10&&x<=20)
				in+=1;
			else
				out+=1;
		}
		
		System.out.printf("%d in%n%d out",in,out);
		sc.close();
	}

}
