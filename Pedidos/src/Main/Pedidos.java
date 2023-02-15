package Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Dados_Loja.Cliente;
import  Dados_Loja.Order;
import  Dados_Loja.OrderItem;
import  Dados_Loja.Product;
import Dados_Loja.enums.Order_Status;

public class Pedidos {
	
		public static void main(String args[]) throws ParseException  {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter Client DATA ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		
		System.out.println("email: ");
		String email = sc.next();
		
		System.out.println("Birth Date(DD/MM/YYYY): ");
		sc.nextLine();
		Date birthDate = sdf.parse(sc.next());
		
		Cliente client = new Cliente(name,email,birthDate);
		
		System.out.println("Enter order DATA ");
		System.out.println("Status: ");
		sc.nextLine();
		Order_Status status = Order_Status.valueOf(sc.next());
		
		Order order = new Order(new Date(),status,client);
		
		System.out.println("How many items to this order: ");
		int items = sc.nextInt();
		
		for(int i = 0;i < items;i++) {
			System.out.printf("enter #%d product: \n",i+1);
			
			System.out.println("Product name:");
			sc.nextLine();
			String namer = sc.nextLine();
			
			System.out.println("Product quantity:");
			int quant = sc.nextInt();
			
			System.out.println("Price:");
			double price = sc.nextDouble();
			
			Product prod = new Product(namer,price);
			OrderItem orderIt = new OrderItem(quant,price,prod);
			order.addItens(orderIt);
		}
		System.out.println("order data:");
		System.out.println(order);
		
		sc.close();
	}
	
}
