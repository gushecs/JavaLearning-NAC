package applications;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.paymentServices.PaypalPaymentService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			
			System.out.println("Enter contract data:");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Date (dd/MM/yyyy): ");
			String dateString = sc.nextLine();
			Date date = sdf.parse(dateString);
			System.out.print("Contract value: ");
			double value = sc.nextDouble();
			sc.nextLine();
			Contract contract = new Contract(number,date,value,new PaypalPaymentService());
			System.out.print("Enter number of installments: ");
			int installments = sc.nextInt();
			sc.nextLine();
			System.out.println("Installments:");
			contract.getInvoice(installments);

		} catch (Exception e) {
			e.getStackTrace();
		}

		sc.close();

	}

}
