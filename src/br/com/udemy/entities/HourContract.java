package br.com.udemy.entities;

import java.util.Date;

public class HourContract {

	private Date date;
	private double valuePerHour;
	private int hours;

	public HourContract() {
	}

	public HourContract(Date date, double valuePerHour, int hours) {
		super();
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	
	//Delegate, ou seja, e delegada a classe HourContract a obrigação de retornnar o valor total do contratos.	
	public double totalValue() {
		return valuePerHour * hours;
	}

}
