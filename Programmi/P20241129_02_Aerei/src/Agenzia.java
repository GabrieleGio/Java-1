import java.util.ArrayList;
import java.util.List;

public class Agenzia {
	private String nome;
    
    public Agenzia(String nome) {
        this.nome = nome;
    }
    
    public Agenzia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void prenotaVolo(Volo volo) {
        if (volo.isDisponibile()) {
            volo.aggiungiPrenotazione();
        } else {
            System.out.println("Volo non prenotabile.");
        }
    }
    public void cancellaPrenotazione(Volo volo) {
        // Logica per ripristinare la prenotabilità del volo se necessario
    }
}
