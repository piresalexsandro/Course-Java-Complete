package br.com.udemy.entities;

public class PessoaJuridica extends Pessoa{
	
	private int nroFunc;
	
	public PessoaJuridica() {
	}

	public PessoaJuridica(int nroFunc) {
		super();
		this.nroFunc = nroFunc;
	}
	

	public int getNroFunc() {
		return nroFunc;
	}


	public PessoaJuridica(String name, Double rendaAnual, int nroFunc) {
		super(name, rendaAnual);
		this.nroFunc = nroFunc;
	}

	public void setNroFunc(int nroFunc) {
		this.nroFunc = nroFunc;
	}

	@Override
	public double taxa() {
		if (this.nroFunc <= 10) {
			return getRendaAnual() * 0.16;
		}
		else {
			return getRendaAnual() * 0.14;
		}
	}
	
	@Override
	public String toString() {
		return "Numero de funcionarios: " + nroFunc;
	}
	


}
