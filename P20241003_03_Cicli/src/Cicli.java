import java.util.Scanner;

public class Cicli {

	public static void main(String[] args) {
		// Numeri da 0 a 10
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		// Tabellina del 7
		System.out.println("Primo metodo:");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i * 7);
		}
		System.out.println("Secondo metodo:");
		for (int i = 0; i < 71; i += 7) {
			System.out.println(i);
		}

		System.out.println("Terzo metodo:");
		for (int i = 0; i <= 10; i++) {
			int m = 7 * i;
			System.out.println(m);
		}
		// Controllo per vedere se 7 è pari o dispari
		int numero = 7;
		if (numero % 2 == 0) {
			System.out.println(numero + " è pari");
		} else {
			System.out.println(numero + " è dispari");
		}
		//Come leggere da tastiera
		Scanner leggi = new Scanner(System.in);
		
		//Per leggere un numero intero
		int n2 = leggi.nextInt();
		
		//Per leggere una linea di testo
		String s1 = leggi.nextLine();
		
		//leggere 10 numeri da tastiera e stampare
		//per ognuno di loro se è maggiore o minore di 10
		System.out.println("Inserisci un numero: ");
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i <= 10; i++) {
			int numeroo = scanner.nextInt();
			if (numeroo > 10) {
				System.out.println("Il numero " + numeroo + " è maggiore di 10");
			} 
			if (numeroo == 10) {
				System.out.println("Il numero " + numeroo + " è uguale a 10");
			}
			if (numeroo < 10) {
				System.out.println("Il numero " + numeroo + " è minore di 10");
			}
		}

	}

}
