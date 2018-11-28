package br.com.udemy.curso;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeSalary {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc  = new Scanner(System.in);
		Employee ep = new Employee();
		
		System.out.println("Name.........:");
		ep.name = sc.nextLine();
		
		System.out.println("Gross Salary.:");
		ep.grossSalary  = sc.nextDouble();
		System.out.println("Tax..........:");
		ep.tax = sc.nextDouble();
		ep.netSalary();
		
		System.out.printf("Which percent to increase salary?");
		double percentage = sc.nextDouble();
		ep.increaseSalary(percentage);
		
		System.out.println("Update data: " + ep);
		
		sc.close();
	}

}
