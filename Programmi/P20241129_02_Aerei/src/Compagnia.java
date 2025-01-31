import java.util.ArrayList;
import java.util.List;

public class Compagnia {
	private String nome;
	private List<Volo> voli;
    private List<Aereo> aerei;

    public Compagnia(String nome) {
        this.nome = nome;
        this.voli = new ArrayList<>();
        this.aerei = new ArrayList<>();
    }
    
    public Compagnia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Volo> getVoli() {
		return voli;
	}
	public void setVoli(List<Volo> voli) {
		this.voli = voli;
	}
	public List<Aereo> getAerei() {
		return aerei;
	}
	public void setAerei(List<Aereo> aerei) {
		this.aerei = aerei;
	}
	
	public void creaAereo(String id, String modello, int posti) {
        Aereo aereo = new Aereo(id, modello, posti);
        aerei.add(aereo);
    }
    
    public void mostraAerei() {
        for (Aereo aereo : aerei) {
            System.out.println(aereo);
        }
    }
    
    public void eliminaAereo(Aereo aereo) {
        aerei.remove(aereo);
    }
    
    public void aggiungiVolo(Volo volo) {
        voli.add(volo);
    }

	
	
}
