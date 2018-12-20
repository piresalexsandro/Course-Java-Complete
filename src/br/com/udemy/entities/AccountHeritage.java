package br.com.udemy.entities;

public class AccountHeritage {
	private Integer number;
	private String holder;
	protected Double balance;
	
	public AccountHeritage() {
	}

	public AccountHeritage(Integer number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public double withdraw(double amount){
		return balance -= amount;
	}
	
	public double deposit(double amount){
		return balance += amount;
	}
	
	
}
