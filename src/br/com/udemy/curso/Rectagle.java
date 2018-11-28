package br.com.udemy.curso;

public class Rectagle {
	
	public double width;
	public double height;
	
	public double area() {
		double area = this.width * this.height;
		return area;
	}
	
	public double perimeter() {
		double perimeter = this.width * 2 + this.height * 2;
		return perimeter;
	}

	public double diagonal() {
		double x = Math.pow(this.width, 2) + Math.pow(this.height, 2); 
		return Math.sqrt(x);
	}

}
