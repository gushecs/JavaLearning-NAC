package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n=sc.nextInt();
		
		Room[] room=new Room[10];
		String name,email;
		int roomNumber;
		
		for (int i=0;i<n;i++) {
			System.out.println();
			sc.nextLine();
			System.out.println("Rent #"+(i+1));
			System.out.print("Name: ");
			name=sc.nextLine();
			System.out.print("Email: ");
			email=sc.nextLine();
			System.out.print("Room: ");
			roomNumber=sc.nextInt();
			room[roomNumber]=new Room(name,email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i=0;i<10;i++) {
			if (room[i]!=null) {
				System.out.println(room[i].toStringChanged(i));
			}
				
		}
		
		sc.close();

	}

}
