package application; 

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.entities.Employee;
import br.com.udemy.entities.Pensao; 

public class ProgramEmployee { 

        public static void main(String[] args) { 
                
                Locale.setDefault(Locale.US); 
                Scanner sc = new Scanner(System.in); 
                
                System.out.print("How many employees will be registered? "); 
                int n = sc.nextInt(); 
                Employee[] vect = new Employee[n]; 
                System.out.println(); 

                List<Object> list = new ArrayList<>(); 

                for(int i=0; i<vect.length; i++){ 
                        int en = 1; 
                        en += i; 
                        System.out.println("Emplyoee #" + en + ": "); 
                        System.out.print("Id: "); 
                        int id = sc.nextInt(); 
                        System.out.print("Name: "); 
                        String name = sc.next(); 
                        System.out.print("Salary: "); 
                        double salary = sc.nextDouble(); 
                        System.out.println(); 
            			vect[i] = new Employee(id, name, salary);
                        list.add(vect[i]); 
                } 
                
                System.out.print("Enter the employee id that will have salary increase : "); 
                int id = sc.nextInt(); 
            /*  int indexOf = list.indexOf(new Employee(id)); 
                System.out.println("index of"+list.indexOf(new Employee(id)));
                System.out.println("Funcionario"+list.get(indexOf));    */
                
                for (int i = 0; i<vect.length; i++) { 
					if (vect[i].getId() == id) {
		                System.out.print("Enter the percentage: "); 
		                double perc = sc.nextDouble(); 
						vect[i].incrise(vect[i].getSalary(), perc);
					}
                } 

                System.out.println();
                System.out.println("List of employees:");

                for (int i = 0; i<vect.length; i++) { 
					System.out.println(vect[i]);
                } 
                
                sc.close(); 
        } 

} 