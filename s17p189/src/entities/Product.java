package entities;

public class Product {
	
	private String product;
	private double price;
	private int amount;
	
	public Product(String product, double price, int amount) {
		this.product = product;
		this.price = price;
		this.amount = amount;
	}

	public String getProduct() {
		return product;
	}

	public double getPrice() {
		return price;
	}

	public int getAmount() {
		return amount;
	}
	
	public double finalPrice() {
		return price*amount;
	}

	@Override
	public String toString() {
		return product+","+String.format("%.2f", finalPrice())+"\n";
	}
	
	

}
