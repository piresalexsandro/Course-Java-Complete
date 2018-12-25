package br.com.udemy.entities;

public abstract class Pessoa {
	
	private String name;
	private Double rendaAnual;
	
	public Pessoa(){
	}

	public Pessoa(String name, Double rendaAnual) {
		super();
		this.name = name;
		this.rendaAnual = rendaAnual;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
		
	public abstract double taxa();
}
