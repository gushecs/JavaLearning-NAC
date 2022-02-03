package applications;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enu.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name=sc.nextLine();
		System.out.print("Email: ");
		String email=sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate=sdf.parse(sc.next());
		Date moment=new Date();
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status=sc.next();
		System.out.print("How many items to this order? ");
		int orders=sc.nextInt();
		
		Client client=new Client(name,email,birthDate);
		Order order=new Order(moment,OrderStatus.valueOf(status),client);
		
		for (int i=1;i<=orders;i++) {
			System.out.println("Enter #"+i+" item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName=sc.nextLine();
			System.out.print("Product price: ");
			double productPrice=sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity=sc.nextInt();
			order.addItem(new OrderItem(quantity,productPrice,new Product(productName,productPrice)));
		}
		
		System.out.println(order);
		sc.close();

	}

}
