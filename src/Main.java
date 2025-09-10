import entities.Circle;

public class Main {
	public static void main(String[] args) {

		// Creo 3 oggetti con 3 costruttori diversi
		Circle c1 = new Circle();
		System.out.println(c1.radius);

		Circle c2 = new Circle(20.4);
		System.out.println(c2.radius);

		Circle c3 = new Circle("15.2");
		System.out.println("Il raggio è: " + c3.radius);
		System.out.println("Il perimetro è: " + c3.getPerimeter());
		System.out.println("L'area è: " + c3.getArea());

		Circle c4 = new Circle(20);
		c4.radius = 1000;
		System.out.println("Il raggio è: " + c4.radius);
		System.out.println("Il perimetro è: " + c4.getPerimeter());
		System.out.println("L'area è: " + c4.getArea());
		c4.printAreaAndPerimeter();

	}
}
