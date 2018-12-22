package br.com.udemy.entities;

public class EmployeeHeritage {
	private String name;
	private double valuePerHour;
	private int hour;
	
	public EmployeeHeritage() {		
	}

	public EmployeeHeritage(String name, double valuePerHour, int hour) {
		super();
		this.name = name;
		this.valuePerHour = valuePerHour;
		this.hour = hour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public double payment() {
		return hour * valuePerHour;
	}
}
