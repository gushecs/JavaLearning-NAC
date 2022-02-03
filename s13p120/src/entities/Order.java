package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enu.OrderStatus;

public class Order {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	private Client client;
	
	private List<OrderItem> items=new ArrayList<>();

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("\n\nORDER SUMMARY:\n");
		sb.append("Order moment: "+ sdf.format(moment) +"\n");
		sb.append("Order status: "+ status +"\n");
		sb.append("Client: "+ client +"\n");
		sb.append("Order items:\n");
		double total=0;
		for (OrderItem o:items) {
			sb.append(o+"\n");
			total += o.SubTotal();
		}
		sb.append("Total price: $"+String.format("%.2f", total)+"\n");
		return sb.toString();
	}
	
	
}
