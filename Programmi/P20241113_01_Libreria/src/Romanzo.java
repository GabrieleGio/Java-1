public class Romanzo extends Libro {
    private String genere;

    public Romanzo() {
        super();
    }

    public Romanzo(String codice, String titolo, String autore, String descrizione, String genere) {
        super(codice, titolo, autore, descrizione);
        this.genere = genere;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

	public String descrivi() {
        return "Romanzo: " + genere + "\nDescrizione: " + getDescrizione();
    }
}