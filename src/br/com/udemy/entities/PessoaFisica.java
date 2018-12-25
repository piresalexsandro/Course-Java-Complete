package br.com.udemy.entities;

public class PessoaFisica extends Pessoa{

		private Double gastoComSaude;
		
		public PessoaFisica() {
			super();
		}

		public PessoaFisica(String name, Double rendaAnual, Double gastoComSaude) {
			super(name, rendaAnual);
			this.gastoComSaude = gastoComSaude;
		}

		public Double getGastoComSaude() {
			return gastoComSaude;
		}

		public void setGastoComSaude(Double gastoComSaude) {
			this.gastoComSaude = gastoComSaude;
		}
		
		
		@Override
		public double taxa() {
			if (super.getRendaAnual() < 20000.00) {
				return getRendaAnual() * 0.15 - gastoComSaude * 0.5;
			}
			else {
				return getRendaAnual() * 0.25 - gastoComSaude * 0.5;
			}
		}

		@Override
		public String toString() {
			return "Despesas médicas: " + String.format("/.2f", gastoComSaude);
		}
		
		
		
		
}
