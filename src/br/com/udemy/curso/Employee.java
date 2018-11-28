package br.com.udemy.curso;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	public double percentage;
	
	public double netSalary() {
		return grossSalary - this.tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary	+= grossSalary * percentage / 100;
	}
	
	public String toString() {
		return name + ", " + String.format("%.2f", netSalary());
		//return name + ", $ " + String.format("%.2f", netSalary());
	}
}
