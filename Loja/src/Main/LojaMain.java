package Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

public class LojaMain {
	public static void main(String Args[]) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		
		System.out.println("Enter the number of pruducts: ");
		int n = sc.nextInt();
		
		List<Product> products = new ArrayList<>();
		
		for(int i = 0;i < n;i++) {
			System.out.printf("product #%d data: \n",i+1);
			System.out.println("common,used or imported (c,u,i)?");
			sc.nextLine();
			String c = sc.nextLine();
			
			System.out.println("Name: ");
			String name = sc.next();
			
			System.out.println("Price: ");
			Double price = sc.nextDouble();
			
			if(c.charAt(0) == 'u' || c.charAt(0) == 'U') {
				System.out.println("Manufactured Date(dd/mm/yyyy): ");
				Date mandate = sdf.parse(sc.next());
				
				products.add(new UsedProduct(name,price,mandate));
			}
			else if(c.charAt(0) == 'i' || c.charAt(0) == 'I') {
				System.out.println("Customs Fee: R$");
				Double cFee =  sc.nextDouble();
				
				products.add( new ImportedProduct(name,price,cFee));
			}
			else { products.add( new Product(name,price));}
			
				
		}
		
		System.out.println("Price Tags: ");
		for(Product p : products ) {
			System.out.println(p.toString());
		}
		
		sc.close();
	}
}
