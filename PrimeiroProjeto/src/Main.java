
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		String nome;
		
		System.out.println("Informe a sua idade: ");
		idade = sc.nextInt();
		sc.nextLine();
		System.out.println("Qual o seu nome ?");
		nome = sc.nextLine();
		
		System.out.printf("Olá %s ano que vem você fará %d anos",nome,idade + 1);
	}
}