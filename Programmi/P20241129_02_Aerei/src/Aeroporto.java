import java.util.ArrayList;
import java.util.List;

public class Aeroporto {
    private String nome;
    private List<Volo> voliAtterrati;

    public Aeroporto(String nome) {
        this.nome = nome;
        this.voliAtterrati = new ArrayList<>();
    }
    
    public Aeroporto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Volo> getVoliAtterrati() {
		return voliAtterrati;
	}

	public void setVoliAtterrati(List<Volo> voliAtterrati) {
		this.voliAtterrati = voliAtterrati;
	}

	@Override
	public String toString() {
		return "Aeroporto [nome=" + nome + ", voliAtterrati=" + voliAtterrati + "]";
	}

	public void imbarco(Volo volo) {
		volo.SetNonDisponibile();
	}
	
	public void decollo(Volo volo) {
        if(volo.isDisponibile() == true) {
        	volo.SetNonDisponibile();
        	//Altre funzioni per il decollo
        }
    }
    
    public void atterraggio(Volo volo) {
    	voliAtterrati.add(volo);
    }
	
   // Altri metodi per gestire voli
}