package br.com.udemy.curso;

import java.util.Locale;
import java.util.Scanner;

public class DolarQuotation {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double p = 0;
		double q = 0;
		
		CurrencyConverter.price = input.nextDouble();
		CurrencyConverter.price = p;
		System.out.printf("What's the dollar price: %.2f", p);

		CurrencyConverter.quantity = input.nextDouble();
		CurrencyConverter.quantity = q;
		System.out.printf("What's the dollar price: %.2f", q);
		
		CurrencyConverter.valueConverted(p, q);
		
	}

}
