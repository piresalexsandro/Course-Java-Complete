package br.com.udemy.entities;

public class Employee { 
        private int id; 
        private String name; 
        private double salary; 
        
        public Employee(int id, String name, double salary) { 
                super(); 
                this.id = id; 
                this.name = name; 
                this.salary = salary; 
        } 
        
        public Employee(int id) { 
            this.id = id; 
    }


		public int getId() { 
                return id; 
        } 

        public void setId(int id) { 
                this.id = id; 
        } 

        public String getName() { 
                return name; 
        } 

        public void setName(String name) { 
                this.name = name; 
        } 

        public double getSalary() { 
                return salary; 
        } 

/*        public void setSalary() { 
                this.salary = salary; 
        }*/ 
        
        public void incrise(double salary, double perc) { 
                this.salary += salary * perc /100; 
        } 
        
        public String toString(){ 
                return this.id + ", " + this.name + ", " + String.format("%.2f",this.salary); 
        } 
        
        @Override
        public int hashCode() {
        	final int prime = 31;
        	int result = 1;
        	result = prime * result + id;
        	return result;
        }
        
        @Override
        public boolean equals(Object obj) {
        	if (this == obj)
        		return true;
        	if (obj == null)
        		return false;
        	if (getClass() != obj.getClass())
        		return false;
        	Employee other = (Employee) obj;
        	if (id != other.id)
        		return false;
        	return true;
        }
} 