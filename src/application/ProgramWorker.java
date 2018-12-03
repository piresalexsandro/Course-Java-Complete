package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.entities.Departament;
import br.com.udemy.entities.HourContract;
import br.com.udemy.entities.Worker;
import br.com.udemy.entities.enuns.WorkerLevel;

public class ProgramWorker {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine(); 
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departmentName));
		
		System.out.print("How many contracts to this worker?");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Enter contract #" + i + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate  = sdf.parse(sc.next()); //formata a data digitada para o formato declarado SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);  //
			worker.addContract(contract); // associa o trabalhador aos contratos 1:N
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): "); 
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2)); // tranforma as posiçoes em int
		int year = Integer.parseInt(monthAndYear.substring(3)); // transforma as partir ate a ultima posicao em int 
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartament().getName()); //ASSOCIAÇAO: eu tenho o obj trabalhador eu acesso o outro objeto e o atributo deste ultimo, como um caminho de pastas
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month))); // formata para que fique  com dois 0 como casa decimal
		
		sc.close();
	}

}
