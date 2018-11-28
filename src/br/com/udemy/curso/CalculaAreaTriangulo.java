package br.com.udemy.curso;

import java.util.Locale;
import java.util.Scanner;

public class CalculaAreaTriangulo {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter with mesurements of the triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter with mesurements of the triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		x.area();
		y.area();
		
		System.out.printf("Triangle X area: %.4f%n", x.area());
		System.out.printf("Triangle Y area: %.4f%n", y.area());
		
		if (x.area() > y.area()) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		sc.close();
		
	}
	
}
