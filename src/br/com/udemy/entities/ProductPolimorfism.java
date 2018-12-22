package br.com.udemy.entities;

public class ProductPolimorfism {
	
	private String name;
	protected double price;
	
	public ProductPolimorfism() {
	}

	public ProductPolimorfism(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String priceTag() {
		return this.name + " $" + String.format("%.2f", this.price);
	}	
}
