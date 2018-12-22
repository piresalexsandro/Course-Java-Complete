package br.com.udemy.entities;

public class ImportedProduct extends ProductPolimorfism{
	
	private double customFree;

	public ImportedProduct(double customFree) {
		super();
	}

	public ImportedProduct(String name, double price, double customFree) {
		super(name, price);
		this.customFree = customFree;
	}

	public double getCustomFree() {
		return customFree;
	}

	public void setCustomFree(double customFree) {
		this.customFree = customFree;
	}
	
	public void totalPrice(double price) {
		price += price + customFree;
	}

	@Override
	public String priceTag() {
		totalPrice(price);
		return super.priceTag() + " (Customs free: $" + String.format("%.2f", this.customFree) + ")";
	}	
}
