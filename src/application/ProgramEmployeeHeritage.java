package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.entities.EmployeeHeritage;
import br.com.udemy.entities.OutsourcedEmployee;

public class ProgramEmployeeHeritage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		List<EmployeeHeritage> list = new ArrayList<>();
		
		 System.out.print("Enter the number of employees: ");
		 int n = sc.nextInt();
		 
		 for(int i=1; i<=n; i++) {
			 System.out.println("Employee #" + i + " data: ");
		 	 System.out.print("Outsurced (y/n)? ");
		 	 char ch = sc.next().charAt(0);
		 	
		 	 System.out.print("Name.............: ");
		 	 sc.nextLine();
		 	 String name = sc.nextLine();
		 	
		  	 System.out.print("Hours............: ");
		  	 int hours = sc.nextInt();
		  	
		 	 System.out.print("Value per hour...: ");
		 	 double valuePerHour = sc.nextDouble();
		 	
		 	 if (ch == 'y') {
		 	 	System.out.print("Additional charge: ");
		  		double additionalCharge = sc.nextDouble();
		 		list.add(new OutsourcedEmployee(name, valuePerHour, hours, additionalCharge));
		 		//EmployeeHeritage emph = new OutsourcedEmployee(name, valuePerHour, hours, additionalCharge);
		 		//list.add(emph);
		 	 } else {
		 		list.add(new EmployeeHeritage(name, valuePerHour, hours));		 		
		 		//EmployeeHeritage emph = new EmployeeHeritage(name, valuePerHour, hours);
		 	 }
			 System.out.println();
		 }
		 
		 System.out.println("PAYMENTS:");
		 
		 // PARA CADA FUNCIONARIO 'EMP' NA MINHA LISTA 'LIST'
		 for (EmployeeHeritage emp : list) {
			 System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
		 }
		sc.close();
	}

}
