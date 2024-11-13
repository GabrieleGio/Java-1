/*
 * Costruire una classe Persona e verificare il funzionamento di getter e setter
 * -aggiungere un attributo temperatura alla persona
 */
public class Main {

	public static void main(String[] args) {
		
		TriangoloRettangolo tr = new TriangoloRettangolo(1,2);
		
		System.out.println(tr.Area());
		
		tr.setCat1(100);
		System.out.println(tr.Area());
		
		Persona pr = new Persona();
		pr.setNome("Ciccio");
		pr.setTemperaturaCelsius(37.5);
		
	}

}
