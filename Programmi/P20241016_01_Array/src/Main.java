
public class Main {

	public static void main(String[] args) {
		/*
		 * Un array è una struttura dati staticamente definita
		 * è organizzata come sequenza contigua di memoria
		 * è acccesibile tramite indice (in analogia agli insiemi di python)
		 * Contrariamente agli insieme di python gli array in java sono
		 * 1) a dimensione fissa (definita a tempo di creazione dell'array
		 * 2) non modificabili nelle dimensioni
		 * 3) ad accesso diretto dei singolo elementi. I tempi di accesso
		 * 		sono confrontabili con la velocità della CPU
		 * 4) gli elementi di un array in Java sono tutti dello stesso tipo
		 * 		(ricordate che Java è un linguaggio fortemente tipizzato)
		 * 5) Ricordate che in Java quando dichiaro una variabile senza
		 * 		assegnarle un valore, prende il valore di default:
		 * 		per gli interi e i decimali è 0
		 * 		per le stringhe e gli oggetti in genere è null
		 * 		per gli array è ovviamente null	
		 */
		
		int[] v;
		
		v = new int[100];  //ho dichiarato un array di interi lungo 100
		
		System.out.println(v.toString());
		
		//Main[] programmi = new Main[100];
		//programmi[55].main(null);
		
		v[4] = 100;
		v[90] = 200;
		v[0] = v[4]+v[90];
		
		int i=10;
		v[i] = v[9*i];
		
		//Come scandire un array?
		
		//Inserire nell'array v (di 100 elementi interi)
		//i numeri da 0 a 99
		for (int n=0;n<100;n++) {
			v[n] = n;
		}
		
		//Quanto è lungo un array gia dichiarato?
		System.out.println(v.length);
		
		//Quindi per riempirlo tutto:
		for (int j=0;j<v.length;j++) {
			v[j] = j;
		}
		//Riempire un array di numeri casuali tra 0 a 1000
			for (int s=0;s<v.length;s++) {
				v[s] = (int)(Math.random()*1000);
			}
		//Dichiarare un array di 1000 double
		//inserire nell'array un valore casuale compreso tra 0 e 100
		//contare quanti elementi sono minori di 50
		//calcolare somma e media dei numeri nell'array
		//calcolare quante volte il numero successivo è maggiore del precedente
		//calcolare la lunghezza della più lunga sequenza di numeri crescenti
		double[] d;
		d = new double[1000];
		int cnsm = 0;
		int contatoreseq = 0;
		Double somma = 0.0;
		Double media = 0.0;
		//Riempimento array
		for (int q=0;q<d.length;q++) {
			d[q] = (Math.random()*100);
		}
		//Somma e media
		for (int b=0;b<d.length;b++) {
			somma = somma + d[b];
			}
		System.out.println("Somma: " + somma);
		System.out.println("Media: " + media);
		media = somma / d.length;
		
		//Calcolo quante volte successivo maggiore del prec
		for (int b=0;b<d.length-1;b++) {
		if (d[b+1]>d[b]) {
			cnsm = cnsm + 1;
						}
										}
		System.out.println("Quante volte il numero successivo è maggiore del precedente: " + cnsm);
		
		//Calcolo lunghezza della sequenza più lunga
		
				
	}
}
	


