package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter the account number: ");
		int number = sc.nextInt();
		System.out.print("Enter the account's owner name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Does " + name + " have an initial deposit? (y/n) ");
		char answerc = sc.next().charAt(0);

		if (answerc == 'y') {
			System.out.print("What's the account initial deposit? ");
			double balance = sc.nextDouble();
			account = new Account(number, name, balance);
			System.out.print(account);
		} else {
			account = new Account(number, name);
			System.out.print(account);
		}
		
		account.modifyAccount(sc);
		sc.close();
	}

}
