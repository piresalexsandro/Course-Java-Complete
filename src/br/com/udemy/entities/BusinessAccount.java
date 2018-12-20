package br.com.udemy.entities;

public class BusinessAccount extends AccountHeritage{  // extends = herda metodos e atributos da classe AccountHeritage
	
	private Double loanLimit;
	
	public BusinessAccount() {
	}

	public BusinessAccount(Double loanLimit) {
		super();
		this.loanLimit = loanLimit;
	}

	public BusinessAccount(Integer number, String holder, double balance, Double loanLimit) {
		super(number, holder, balance); // chama o construtor da super classe
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10;
		}
	}
	
}
