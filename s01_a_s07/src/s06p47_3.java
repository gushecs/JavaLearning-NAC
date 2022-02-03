import java.util.Scanner;

public class s06p47_3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int x = 1;
		int ca=0,cg=0,cd=0;
		
		while (x!=4) {
			x=sc.nextInt();
			
			if (x==1)
				ca+=1;
			else if (x==2)
				cg+=1;
			else if (x==3)
				cd+=1;
		}
		
		System.out.printf("MUITO OBRIGADO%nAlcool: %d%nGasolina: %d%nDiesel: %d%n",ca,cg,cd);
		sc.close();
	}

}
