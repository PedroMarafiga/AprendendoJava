package main;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import model.exception.DomainException;

public class Main {
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
			System.out.println("ENTER ACCOUNT DATA");
			System.out.println("Number: ");
			Integer number = sc.nextInt();
			System.out.println("Account holder: ");
			sc.next();
			String name = sc.nextLine();
			System.out.println("Initial balance: ");
			Double IB = sc.nextDouble();
			System.out.println("Withdraw limit: ");
			Double WL = sc.nextDouble();
			
			Account account = new Account(number,name,IB,WL);
			
			System.out.println("Enter ammount for withdraw:");
			Double withdraw = sc.nextDouble();
		try {
			account.withdraw(withdraw);
			System.out.printf("New balance: %.2f\n",account.getBalance());
		}
		catch(DomainException e){
			System.out.println("Error in withdraw: " + e.getMessage());
		}
		
		
		sc.close();
	}
}
