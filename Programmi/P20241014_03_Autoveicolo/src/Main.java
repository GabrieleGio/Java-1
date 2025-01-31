
public class Main {

	public static void main(String[] args) {
		System.out.println("Veicolo 1:");
		Autoveicolo veicolo1 = new Autoveicolo(950, 16, 60, 50, "Nero", 16000.0);
		System.out.println("Distanza percorsa in 3 ore: "+ veicolo1.distanzapercorsa(3.0) + " km");
		System.out.println("Distanza percorsa in 11 ore: "+ veicolo1.distanzapercorsa(11.0) + " km");
		System.out.println();
		System.out.println("Veicolo 2:");
		Autoveicolo veicolo2 = new Autoveicolo(1000, 20, 70, 60, "Blu", 20000.0);
		System.out.println("Distanza percorsa in 3 ore: "+ veicolo2.distanzapercorsa(3.0) + " km");
		System.out.println("Distanza percorsa in 11 ore: "+ veicolo2.distanzapercorsa(11.0) + " km");
		System.out.println();
		System.out.println("Veicolo 3:");
		Autoveicolo veicolo3 = new Autoveicolo(800, 15, 55, 55, "Rosso", 8000.0);
		System.out.println("Distanza percorsa in 3 ore: "+ veicolo3.distanzapercorsa(3.0) + " km");
		System.out.println("Distanza percorsa in 11 ore: "+ veicolo3.distanzapercorsa(11.0) + " km");



	}

}
