package br.com.udemy.curso;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	public static double price;
	public static double quantity;
	
	
	public static double valueConverted(double dollarPrice, double dollarQuantity) {
		
		dollarPrice += dollarPrice * IOF;
		
		double realValue = dollarPrice * dollarQuantity;		
		
		return realValue;
	}

}
