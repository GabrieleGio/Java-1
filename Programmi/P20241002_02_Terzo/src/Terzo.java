
public class Terzo {

	public static void main(String[] args) {
		System.out.println("Prima riga");
		System.out.println("Seconda riga");
		System.out.println("Terza riga");
		
		int pippo;
		
		pippo = 100;
		
		System.out.println(pippo);
		
		/* Estendere questo programma dichiarando una variabile intera di
		 * nome pluto, assegnandole il valore 200 e stampare la somma
		 * tra pippo e pluto
		 */
		int pluto = 200;
		System.out.println("Somma tra pippo e pluto = " + (pippo+pluto));
		
		//Ora...
		//int è grande 4 byte e gestite tanto i positivi che i negativi
		int numerone = 2147483647;
		System.out.println("Numerone vale: " + numerone);
		
		numerone = numerone+1;
		System.out.println("Numerone+1 vale: " + numerone);
		
		//Tipi di dato interi:
		
		byte b;     //1 byte
		short s;	//2 byte
		int i;		//4 byte
		long l;		//8 byte
		
		//Tipi di dato reali
		float f;	//4 byte
		double d;	//8 byte
		
		int n1, n2;
		n1 = 10;
		n2 = 4;
		System.out.println(n1/n2);
		
		double dn1, dn2;
		dn1 = 10;
		dn2 = 4;
		System.out.println(dn1/dn2);

	}

}
