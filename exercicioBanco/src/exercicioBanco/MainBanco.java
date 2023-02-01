package exercicioBanco;
import java.util.Locale;

import java.util.Scanner;
import cadastro.cadastro;

public class MainBanco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		cadastro cadastro;
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("is there an initial deposit ?(y/n)");
		char depos = sc.next().charAt(0);
		
		
		
		if(depos == 'y') {
			System.out.println("enter initial deposit value: ");
			 double money = sc.nextDouble();
			 cadastro = new cadastro(name,number,money);
		}else { cadastro = new cadastro(name,number);}

		
		
		System.out.println("Account data: " + cadastro);
		
		System.out.println("Enter a deposit data: ");
		double deposit = sc.nextDouble();
		cadastro.addMoney(deposit);
		System.out.println("Updated account data: " + cadastro);
		
		System.out.println("Enter a withdraw data: ");
		deposit = sc.nextDouble();
		cadastro.whithdrawMoney(deposit);
		System.out.println("Updated account data: " + cadastro);
		
		
		sc.close();

	}

}
