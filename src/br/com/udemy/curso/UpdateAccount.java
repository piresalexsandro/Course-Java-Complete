package br.com.udemy.curso;

import java.util.Locale;
import java.util.Scanner;

public class UpdateAccount {

	public static void main(String[] args) {

		String y = "Y";
		String x ;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria cb1 = new ContaBancaria();

		System.out.println("Enter account number: ");
		cb1.setNumeroDaConta(sc.nextInt());

		System.out.println("Enter account holder: ");
		cb1.setNomeDoCliente(sc.next());

		System.out.println("Is there a initial deposit (y/n)? ");
		x = sc.next();
//		if (x == y) { 
//		if (y == "y" || y == "Y") {
		if (x == y) {
			System.out.println("Enter initial deposit value: ");
			String.format("%.2f", cb1.Deposito(sc.nextDouble()));
			System.out.println("Account data " + cb1);
			System.out.println();
		} else {
			System.out.println("Enter a deposit value: ");
			String.format("%.2f", cb1.Deposito(sc.nextDouble()));
			System.out.println("Update account data: " + cb1);
			System.out.println();
		}

		System.out.println("Enter a withdraw value: ");
		String.format("%.2f", cb1.Saque(sc.nextDouble()));
		System.out.println("Update account data: " + cb1);

		sc.close();
	}

}
