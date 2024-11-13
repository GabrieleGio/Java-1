import java.util.ArrayList;
import java.util.List;
public class Compagnia {
	private String codice;
	private String nome;
	private List<Aereo> aerei;
	
	public Compagnia(String codice, String nome) {
		super();
		this.codice = codice;
		this.nome = nome;
		this.aerei = new ArrayList<>();
	}

	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Aereo> getAerei() {
		return aerei;
	}

	@Override
	public String toString() {
		return "Compagnia [codice=" + codice + ", nome=" + nome + ", aerei=" + aerei + "]";
	}
	
	public void aggiungiAereo(Aereo aereo) {
		aerei.add(aereo);
	}
}
