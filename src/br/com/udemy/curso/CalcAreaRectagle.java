package br.com.udemy.curso;

import java.util.Locale;
import java.util.Scanner;

public class CalcAreaRectagle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner inputKeyboard = new Scanner(System.in);
		Rectagle rectagle = new Rectagle();
		
		System.out.println("Enter rectagle width and wight :");
		rectagle.width = inputKeyboard.nextDouble();
		rectagle.height = inputKeyboard.nextDouble();
		
		System.out.println("Area.....: " + String.format("%.2f", rectagle.area()));
		System.out.println("Perimeter: " + String.format("%.2f", rectagle.perimeter()));
		System.out.println("Diagonal.: " + String.format("%.2f", rectagle.diagonal()));
	}
}
