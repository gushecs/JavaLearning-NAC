package applications;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		try {

			File file = new File("D:\\Drive\\Documentos\\ECLIPSE\\JavaLearn\\s17p189\\in.csv");
			String dir = file.getParent() + "\\out";
			Scanner sc = new Scanner(file);
			List<Product> products = new ArrayList<>();
			Locale.setDefault(Locale.US);

			while (sc.hasNextLine()) {
				String[] line = sc.nextLine().split(",");
				String product = line[0];
				double price = Double.parseDouble(line[1]);
				int amount = Integer.parseInt(line[2]);
				products.add(new Product(product, price, amount));
			}

			sc.close();
			new File(dir).mkdir();

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(dir + "\\summary.csv"))) {
				for (Product product : products) {
					bw.write(product.toString());
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
