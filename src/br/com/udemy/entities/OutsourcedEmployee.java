package br.com.udemy.entities;

public class OutsourcedEmployee extends EmployeeHeritage{
	
	private double additionalCharge;

	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, double valuePerHour, int hour, double additionalCharge) {
		super(name, valuePerHour, hour);
		this.additionalCharge = additionalCharge;
	}

	public double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.10;
	}
}
