package application;

import br.com.udemy.entities.AccountHeritage;
import br.com.udemy.entities.BusinessAccount;
import br.com.udemy.entities.SavingAccount;

public class ProgramHeritage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountHeritage acc = new AccountHeritage(1809, "Alexsandro", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Julio", 0.0, 500.0);
		
		//======================= UPCASTING =======================//
		//Todos os metodos da classe pai e os da classe filho
		//BusinessAccount e uma subclasse de AccountHeritage
		AccountHeritage acc1 = bacc; 
		
		//BusinessAccount e uma subclasse de AccountHeritage
		AccountHeritage acc2 = new BusinessAccount(1203, "Joao", 0.0, 2000.0);
		
		//SavingAccount e uma subclasse de AccountHeritage
		AccountHeritage acc3 = new SavingAccount(1910, "Giulia", 0.0, 0.01);
		
		//======================= UPCASTING =======================//
		//BusinessAccount acc4 = acc2; //acc2 e do tipo AccountHeritage
		BusinessAccount acc4 = (BusinessAccount)acc2; // entre parenteses o tipo da subclasse
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount) acc3; // operacao nao permitida
		
		// testando se acc3 e do tipo do objeto BusinessAccount
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!!");
		}
		
		if (acc3 instanceof SavingAccount) {
			SavingAccount acc5 = (SavingAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!!");
		}
		
	}

}
