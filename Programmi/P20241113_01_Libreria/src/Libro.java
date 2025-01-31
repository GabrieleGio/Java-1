
public abstract class Libro {
	private String codice;
	private String titolo;
	private String autore;
	private String descrizione;
	
	public Libro(String codice, String titolo, String autore, String descrizione) {
		super();
		this.codice = codice;
		this.titolo = titolo;
		this.autore = autore;
		this.descrizione = descrizione;
	}
	
	public Libro() {
		super();
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}
	
	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	

	@Override
	public String toString() {
		return "Libro [codice=" + codice + ", titolo=" + titolo + ", autore=" + autore + ", descrizione=" + descrizione
				+ "]";
	}

	public abstract String descrivi();
	
	
	
}
