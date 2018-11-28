package br.com.udemy.entities;

public class ProductVect {
	
	private double price;
	private String name;
	
	public ProductVect(double price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	
	public double getprice() {
		return price;
	}

	public void setprice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
