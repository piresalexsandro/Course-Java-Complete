package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.entities.Pessoa;
import br.com.udemy.entities.PessoaFisica;
import br.com.udemy.entities.PessoaJuridica;
import br.com.udemy.entities.ProductPolimorfism;

public class ProgramPfPj {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Entre com o numero de pagadores de taxa: ");
		int n = sc.nextInt();

		for(int i=1; i<=n; i++) {
			System.out.println("Pagador de taxa #" + i + " data:");
			
			System.out.print("Pessoa Física ou Juridica (f/j)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			String name = sc.next();
			
			System.out.print("Ganho Anual: ");
			double rendaAnual = sc.nextDouble();
			
			if (ch == 'f') {
				System.out.print("Despesa medica: ");
				double gastoComSaude = sc.nextDouble();
				list.add(new PessoaFisica(name, rendaAnual, gastoComSaude));
			}else {
				System.out.print("Numero de funcionarios: ");
				int nroFunc = sc.nextInt();
				list.add(new PessoaJuridica(name, rendaAnual, nroFunc));
			}
		}
		
		System.out.println();
		double sum = 0.0;
		for(Pessoa pfpj : list) {
			double tax =  pfpj.taxa();
			System.out.println(pfpj.getName() + ": $" + String.format("%.2f", pfpj.taxa()));
			sum += tax;
		}
		
		System.out.println();
		System.out.println("Total de impostos: $" + String.format("%.2f", sum));
		
	}


}
