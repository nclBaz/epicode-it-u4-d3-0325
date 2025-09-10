package entities;

public class Circle {
	// LISTA ATTRIBUTI
	public double radius;

	// LISTA COSTRUTTORI
	// Se la lista costruttori è vuota ho comunque a disposizione il COSTRUTTORE DI DEFAULT (o costruttore vuoto)
	// inserito dietro le quinte da Java

	public Circle() {
		this.radius = 1.0;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(String radius) {
		this.radius = Double.parseDouble(radius);
	}

	// LISTA METODI
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}

	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}

	public void printAreaAndPerimeter() {
		System.out.println("Il perimetro è: " + this.getPerimeter());
		System.out.println("L'area è: " + this.getArea());
	}

}
