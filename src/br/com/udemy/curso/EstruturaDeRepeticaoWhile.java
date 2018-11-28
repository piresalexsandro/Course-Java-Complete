package br.com.udemy.curso;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaDeRepeticaoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		double n = sc.nextDouble();
		
		while(n >= 0.0) {
			double sr = Math.sqrt(n);
			System.out.printf("%.3f %n", sr);
			System.out.print("Enter another number: ");
			n = sc.nextDouble();
		}
		
		System.out.println("Negative number!!");
		sc.close();
		

	}

}
