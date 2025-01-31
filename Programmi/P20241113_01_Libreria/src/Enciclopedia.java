
public class Enciclopedia extends Libro {
	private int numeroVolumi;

	
	public Enciclopedia(String codice, String titolo, String autore, String descrizione, int numeroVolumi) {
		super(codice, titolo, autore, descrizione);
		this.numeroVolumi = numeroVolumi;
	}

	
	public int getNumeroVolumi() {
		return numeroVolumi;
	}


	public void setNumeroVolumi(int numeroVolumi) {
		this.numeroVolumi = numeroVolumi;
	}


	@Override
	public String descrivi() {
		return "Numero volumi totale: " + getNumeroVolumi();
	}

}
