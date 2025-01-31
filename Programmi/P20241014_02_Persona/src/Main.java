
public class Main {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Mario","Sturniolo","STRMRA00A01H501D",24,"Via Rossi,34","3489321147");
		System.out.println(persona1.toString());
		//La stessa cosa di questo (perchè c'è Override):
		System.out.println(persona1);
	}
	static int Somma(int a, int b) {
		return a+b;
	}
}
