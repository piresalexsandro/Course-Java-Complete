package application;

import java.util.Locale;
import java.util.Scanner;
import br.com.udemy.entities.ProductVect;

public class ProgramVectProduct {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ProductVect[] vect = new ProductVect[n];	
		
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProductVect(price, name);			
		}
		
		double sum = 0.0;
		for(int i=0; i<vect.length; i++) {
			sum += vect[i].getprice();
		}	
		
		double avg = sum / vect.length;
		System.out.printf("AVERAGE PRICE: %.2f%n", avg);
		
		
	}

}
