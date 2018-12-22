package br.com.udemy.entities;

public class SavingAccount extends AccountHeritage{
	
	private Double interestRate;
	
	public SavingAccount() {
		super();
	}

	public SavingAccount(int number, String holder, double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override //notação para sobreposição do metodo que existe na superclasse
	public final void withdraw(double amount){
		balance -= amount;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
}
