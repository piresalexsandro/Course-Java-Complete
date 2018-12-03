package br.com.udemy.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.udemy.entities.enuns.WorkerLevel;

public class Worker {
	private String name;
	private double baseSalary;
	private WorkerLevel level;
	
	// ASSOCIAÇOES / COMPOSIÇAO DE OBJETOS
	// associaçoes 1:1
	private Departament departament;
	
	// associaçoes 1:N representa com lista de contratos (1 funcionario tem varios contratos) ja devve ser instanciada
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
	}

	// nao gera tipos lista no contrutor
	public Worker(String name, WorkerLevel level, double baseSalary, Departament departament) {
		this.name = name;
		this.baseSalary = baseSalary;
		this.level = level;
		this.departament = departament;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	// nao pode existir o metodo set para o contrato por que esta lista nao pode ser recebida via parametro
	// eu so tenho 1 lista e se ficar o metodo set eu posso ter mais que 1.
	
	//faz associação de um contrato ao funcionario
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	//desfaz associação de um contrato ao funcionario
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}	
	
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		
		for (HourContract c : contracts) { // para cada contrato "c" na lista de contratos "contract", faça!!!
			cal.setTime(c.getDate()); // data do meu contrato como sendo data do calendario para que eu possa gtrabalhar com ela
			int c_year = cal.get(Calendar.YEAR); // pega o ano da data
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;	
	}
}
