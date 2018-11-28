package br.com.udemy.curso; 

public class ContaBancaria { 

        private int numeroDaConta; 
        private String nomeDoCliente; 
        private double valorDoSaldo; 
        private double valorDoDeposito; 
        private double valorDoSaque; 
        private double taxaDeSaque = 5.00; 
        private String temDepositoIncial; 

        public ContaBancaria() { 
        } 

        public ContaBancaria(int numeroDaConta, String nomeDoCliente, double valorDoDeposito, 
                        double valorDoSaque, String temDepositoIncial) { 
                // super(); 
                this.numeroDaConta = numeroDaConta; 
                this.nomeDoCliente = nomeDoCliente; 
                this.valorDoSaldo = 0; 
                this.valorDoDeposito = valorDoDeposito; 
                this.valorDoSaque = valorDoSaque; 
                //this.taxaDeSaque = 5.00; 
                this.temDepositoIncial = temDepositoIncial; 
        } 

        public ContaBancaria(int numeroDaConta, String nomeDoCliente, double valorDoSaldo, double valorDoDeposito, 
                        double valorDoSaque, double taxaDeSaque, String temDepositoIncial) { 
                // super(); 
                this.numeroDaConta = numeroDaConta; 
                this.nomeDoCliente = nomeDoCliente; 
                this.valorDoSaldo = valorDoSaldo; 
                this.valorDoDeposito = valorDoDeposito; 
                this.valorDoSaque = valorDoSaque; 
                this.taxaDeSaque = taxaDeSaque; 
                this.temDepositoIncial = temDepositoIncial; 
        } 

        public int getNumeroDaConta() { 
                return numeroDaConta; 
        } 

        public void setNumeroDaConta(int numeroDaConta) { 
                this.numeroDaConta = numeroDaConta; 
        } 

        public String getTemDepositoIncial() { 
                return temDepositoIncial; 
        } 

        public void setTemDepositoIncial(String temDepositoIncial) { 
                this.temDepositoIncial = temDepositoIncial; 
        } 

        public String getNomeDoCliente() { 
                return nomeDoCliente; 
        } 

        public void setNomeDoCliente(String nomeDoCliente) { 
                this.nomeDoCliente = nomeDoCliente; 
        } 

        public double getValorDoSaldo() { 
                return valorDoSaldo; 
        } 

        public void setValorDoSaldo(double valorDoSaldo) { 
                this.valorDoSaldo = valorDoSaldo; 
        } 

        public double getValorDoDeposito() { 
                return valorDoDeposito; 
        } 

        public void setValorDoDeposito(double valorDoDeposito) { 
                this.valorDoDeposito = valorDoDeposito; 
        } 

        public double getValorDoSaque() { 
                return valorDoSaque; 
        } 

        public void setValorDoSaque(double valorDoSaque) { 
                this.valorDoSaque = valorDoSaque; 
        } 

        public double getTaxaDeSaque() { 
                return taxaDeSaque; 
        } 

        public void setTaxaDeSaque(double taxaDeSaque) { 
                this.taxaDeSaque = taxaDeSaque; 
        } 

        public double Deposito(double valorDoDeposito) { 
                this.valorDoSaldo += valorDoDeposito; 
                return this.valorDoSaldo; 
        } 

        public double Saque(double valorDoSaque) { 
                this.valorDoSaldo -= valorDoSaque + this.taxaDeSaque; 
                return this.valorDoSaldo; 
        } 
        
        public String toString(){ 
                return "Account " 
                                + this.numeroDaConta 
                                + ", Holder: " 
                                + this.nomeDoCliente 
                                + ", Balance: " 
                                + String.format("%.2f",this.valorDoSaldo)                                
                                ; 
        } 

}