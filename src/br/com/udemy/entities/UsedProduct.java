package br.com.udemy.entities;

import java.util.Date;

public class UsedProduct extends ProductPolimorfism{

	private Date manufacturedDate;
	
	public UsedProduct() {
	}

	public UsedProduct(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}

	public UsedProduct(String name, double price, Date manufacturedDate) {
		super(name, price);
		this.manufacturedDate = manufacturedDate;
	}

	public Date getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}
	
	@Override
	public String priceTag() {
		return super.getName() + " (used) " + super.getPrice() + " (Manufacture date: "  + this.manufacturedDate + ")";
	}	
	
}
