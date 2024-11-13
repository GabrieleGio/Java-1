
public class Persona {
	private String nome;
	private String cognome;
	private String cf;
	private int eta;
	private String indirizzo;
	private String telefono;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Persona(String nome, String cognome, String cf, int eta, String indirizzo, String telefono) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
		this.eta = eta;
		this.indirizzo = indirizzo;
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", cf=" + cf + ", eta=" + eta + ", indirizzo="
				+ indirizzo + ", telefono=" + telefono + "]";
	}
	
	
}
