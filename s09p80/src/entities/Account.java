package entities;

import java.util.Scanner;

public class Account {

	private int number;
	private String name;
	private double balance;

	public Account(int number, String name, double balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
	}

	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void addBalance(double balance) {
		this.balance += balance;
	}

	public void withdrawBalance(double balance) {
		this.balance -= (balance + 5.0);
	}

	public String toString() {
		return String.format("%nAccount %d:%n%nOwner: %s%nBalance: $%.2f%n%n", number, name, balance);
	}
	
	public void modifyAccount(Scanner sc) {
		int i = 1;
		while (i == 1) {
			System.out.printf("1 - Change owner name%n2 - add money%n3 - withdraw money%n4 - Quit%n%n");
			int answer=sc.nextInt();
			if (answer==1) {
				System.out.print("Enter the account's owner name: ");
				name=sc.nextLine();
				System.out.print("Update:"+String.format("%n")+this);
			}
			else if (answer==2) {
				System.out.print("What's the account deposit? ");
				double deposit=sc.nextDouble();
				this.addBalance(deposit);
				System.out.print("Update:"+String.format("%n")+this);
			}
			else if (answer==3) {
				System.out.print("What's the account withdraw? ");
				double withdraw=sc.nextDouble();
				this.withdrawBalance(withdraw);
				System.out.print("Update:"+String.format("%n")+this);
			}
			else
				i=0;
		}
	}
}
