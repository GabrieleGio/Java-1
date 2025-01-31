
public class Main {

	public static void main(String[] args) {
		/*
		 * 1) Libreria e Libri
			Crea una superclasse Libro con attributi come titolo e autore.
			Aggiungi un metodo descrivi() che restituisca una descrizione del libro.
			Crea una classe derivata Romanzo che estende Libro.
			Aggiungi l'attributo genere (es. "Fantasy", "Giallo").
			Sovrascrivi il metodo descrivi() per includere il genere nella descrizione.
			Crea un'altra classe derivata Enciclopedia con un attributo numeroVolumi.
			Testa le classi creando vari oggetti e chiamando il metodo descrivi().
		 */
		Romanzo romanzo1 = new Romanzo("AAA0","Il richiamo della foresta","Jack London","In pratica ci sta un cane","Avventura");
		Enciclopedia enciclopedia1 = new Enciclopedia("AAA0","Enciclopedia Generale","Io","Una semplice enciclopedia",5);
		
		String descrizioneRomanzo1 = romanzo1.descrivi();;
		
		String descrizioneEnciclopedia1 = enciclopedia1.descrivi();
		
		System.out.println(descrizioneRomanzo1);
		
		System.out.println(descrizioneEnciclopedia1);
	}

}
