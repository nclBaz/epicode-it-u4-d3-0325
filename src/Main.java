import entities.Circle;
import entities.Student;
import entities.StudentType;

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

		Student aldo = new Student("Aldo", "Baglio", true, StudentType.BACKEND);
		Student giovanni = new Student("Giovanni", "Storti", false, StudentType.FRONTEND);
		Student giacomo = new Student("Giacomo", "Poretti", true, StudentType.FULLSTACK);


		// ---------------------------------------------- STAMPA IN CONSOLE DI OGGETTI ----------------------------
		// Il comportamento di default è quello di stampare l'oggetto rappresentato con nomepackage.nomeclasse@113123131
		// Se non ci va bene questo comportamento di default, devo andare ad aggiungere un toString() personalizzato nella classe

		System.out.println(aldo); // Ricordiamoci che se vogliamo stampare un oggetto con println avremo bisogno del metodo toString()
		System.out.println(giovanni);
		System.out.println(giacomo);

		// -------------------------------------------------- STATIC -----------------------------------------------
		// Quando creiamo delle classi possiamo stabilire che un attributo o metodo sia STATIC.
		// Quando sono definiti come static, essi sono attributi/metodi di CLASSE e non di ISTANZA
		// Questo significa che queste proprietà statiche NON RICHIEDONO UN OGGETTO PER ESSERE UTILIZZATE

		System.out.println(Math.PI); // Math.PI è un ATTRIBUTO STATICO
		System.out.println(Math.sqrt(25)); // Math.sqrt() è un METODO STATICO
		System.out.println("Fino ad adesso abbiamo creato " + Student.getNumStudentiCreati() + " oggetti"); // Student.getNumStudentiCreati() è un METODO STATICO

		// ---------------------------------------------- COMPARAZIONE TRA 2 OGGETTI ---------------------------------
		// Anche se i 2 oggetti dovessero avere esattamente gli stessi attributi, se effettuassi una comparazione
		// tra i 2 tramite ==, il comportamento di questo operatore è quello di confrontare le celle di memoria.
		// Se queste sono diverse (ho usato new 2 volte), allora gli oggetti saranno considerati diversi
		// Se queste sono uguali (Student giacomo2 = giacomo), allora gli oggetti saranno considerati uguali

		Student giacomo2 = new Student("Giacomo", "Poretti", true, StudentType.ALTRO);
		// Student giacomo2 = giacomo;

		if (giacomo.equals(giacomo2)) System.out.println("SONO UGUALI");
		else System.out.println("SONO DIVERSI");

		// Questo comportamento di default possiamo cambiarlo andandoci a creare un metodo EQUALS()
		// Ci creiamo il metodo equals() quando vogliamo comparare i 2 oggetti tramite le loro caratteristiche e non le loro celle di memoria

		// ----------------------------------------------------- INCAPSULAMENTO ------------------------------------
		// Incapsulare una classe significa proteggere i dettagli interni di una classe da un accesso diretto dall'esterno
		// giacomo.name = "Ajeje"; questo è un esempio di accesso diretto (quando un'altra classe accede
		// tramite dot notation ad un attributo per leggerlo/scriverlo)

		// Se usiamo PUBLIC sugli attributi, allora stiamo dando la possibilità di accedere DIRETTAMENTE a quegli attributi
		// Se usiamo PRIVATE allora gli attributi non possono venir acceduti dall'esterno, cioè solo da dentro la classe stessa si può
		// accedervi in lettura/scrittura
		// Lo stesso concetto si applica non solo agli attributi ma anche ai metodi e costruttori
		// Un costruttore private però mi impedirebbe di creare oggetti (quindi attenzione!)
		// Un metodo lo metterò public se voglio permettere il suo utilizzo dal mondo esterno
		// oppure lo metterò private se l'utilizzo è solo interno alla classe

		// System.out.println(giacomo.isFullStacK);
		// Avendo messo tutti gli attributi come PRIVATE non posso più leggere i valori degli attributi dal main
		// Per risolvere il problema si devono implementare i cosiddetti GETTER
		// Un GETTER è un metodo specifico che consente di leggere un certo attributo: es getName(), getSurname(), getId()
		if (giacomo.isFullStacK()) System.out.println("Si, Giacomo è FULLSTACK");
		else System.out.println("No non lo è");

		// Se volessi anche dare la possibilità di modificare il valore di un certo attributo PRIVATE
		// devo crearmi dei SETTER, ovvero metodi appositi per sovrascrivere un certo attributo


	}
}
