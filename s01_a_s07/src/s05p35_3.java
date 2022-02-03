import java.util.Scanner;

public class s05p35_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		String z;
		
		if (x>y) {
			if (x%y==0) {
				z="Sao Multiplos";
			}
			else {
				z="Nao sao Multiplos";
			}
		}
		else {
			if (y%x==0) {
				z="Sao Multiplos";
			}
			else {
				z="Nao sao Multiplos";
			}
		}
		
		System.out.println(z);
		sc.close();

	}

}
