package application;

import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.entities.Pensao;
import java.util.Scanner;

public class ProgramPensao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Pensao[] vect = new Pensao[10];

		System.out.print("Quantos quartos serão alugados: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.print("Nome do locatario "+i+": ");
			String nome = sc.nextLine();
			System.out.print("Email do locatario "+i+": ");
			String email = sc.nextLine();
			System.out.print("Numero do quarto "+i+": ");
			int quarto = sc.nextInt();
			vect[quarto += 1] = new Pensao(nome, email, quarto);
		}
		
		for(int i=0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i]);
			}
		}
		
		
		sc.close();

	}

}
