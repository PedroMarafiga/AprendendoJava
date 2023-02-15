package Dados_Loja;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Dados_Loja.enums.Order_Status;

public class Order {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date moment;
	Order_Status status;
	
	private Cliente client;
	private List<OrderItem> items = new ArrayList<>();
	
	
	public Order(Date moment, Order_Status status, Cliente client) {
		super();
		this.moment = moment;
		this.status = status;
		this.client = client;
	}


	public void addItens(OrderItem item) {
		items.add(item);
	}
	
	public void removeItens(OrderItem item) {
		items.remove(item);
	}
	
	public double total() {
		
		double sum = 0;
		for(OrderItem c:items) {
			sum += c.Subtotal();
		}
		
		return sum;
	}


	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
	
}
