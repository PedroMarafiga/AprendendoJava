package desafio_formasGeometricas;


import java.util.Scanner;

public class formas {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double a,b,c;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		System.out.println("AREAS:");
		System.out.printf("Triangulo A base e C altura: %.4f %n",a*c/2);
		System.out.printf("Circulo de raio C: %.4f %n",c*c*3.1415);
		System.out.printf("Trapézio A e B bases e C altura: %.4f %n",(a+b)*c/2);
		System.out.printf("Quadrado de lado B: %.4f %n",b*b);
		System.out.printf("Retangulo de lado A e B: %.4f %n",b*a);
		
		sc.close();
	}
}

	
