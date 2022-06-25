package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product prod = new Product();
		
		System.out.print("Raio: ");
		double radius = sc.nextDouble();
		double c = prod.circumference(radius);
		double v = prod.volume(radius);
		
		System.out.printf("Circumferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("valor PI: %.2f%n", prod.PI);

		sc.close();
	}

}
