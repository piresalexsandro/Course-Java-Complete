package application;

import br.com.udemy.entities.AccountHeritage;
import br.com.udemy.entities.BusinessAccount;
import br.com.udemy.entities.SavingAccount;

public class ProgramHeritage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountHeritage acc = new AccountHeritage(1809, "Alexsandro", 1000.0);
		acc.withdraw(200.0);
		System.out.println("COM taxa de saque $" + acc.getBalance());
		
		BusinessAccount bacc = new BusinessAccount(1002, "Julio", 1000.0, 500.0);
		
		
		//======================= UPCASTING =======================//
		//Todos os metodos da classe pai e os da classe filho
		//BusinessAccount e uma subclasse de AccountHeritage
		AccountHeritage acc1 = bacc; 
		
		//BusinessAccount e uma subclasse de AccountHeritage
		AccountHeritage acc2 = new BusinessAccount(1203, "Joao", 5000.0, 2000.0);
		acc2.withdraw(300.0); // desconta 5.00 da Accout e mais 3.00 da classe Business
		System.out.println("COM 2 taxas de saque $" + acc2.getBalance());
		
		//SavingAccount e uma subclasse de AccountHeritage
		AccountHeritage acc3 = new SavingAccount(1910, "Giulia", 1000.0, 0.01);
		acc3.withdraw(200.0); // @Override
		System.out.println("SEM taxa de saque $" + acc3.getBalance());
		
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
