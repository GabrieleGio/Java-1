
public class Volo {
	private String partenza;
	private String arrivo;
	private String orario;
	private Aereo aereo;
	private Integer prenotazionimax;
	private Integer prenotazioni;
	private boolean disponibile;
	
	
	public Volo(String partenza, String arrivo, String orario, Aereo aereo) {
		super();
		this.partenza = partenza;
		this.arrivo = arrivo;
		this.orario = orario;
		this.aereo = aereo;
		this.prenotazionimax = aereo.getPosti();
		this.prenotazioni = 0;
		this.disponibile = true;
	}
	
	public Volo() {
		super();
		
	}
	public String getPartenza() {
		return partenza;
	}
	public void setPartenza(String partenza) {
		this.partenza = partenza;
	}
	public String getArrivo() {
		return arrivo;
	}
	public void setArrivo(String arrivo) {
		this.arrivo = arrivo;
	}
	public String getOrario() {
		return orario;
	}
	public void setOrario(String orario) {
		this.orario = orario;
	}
	public Aereo getAereo() {
		return aereo;
	}
	public void setAereo(Aereo aereo) {
		this.aereo = aereo;
	}
	
	public Integer getPrenotazionimax() {
		return prenotazionimax;
	}

	public void setPrenotazionimax(Integer prenotazionimax) {
		this.prenotazionimax = prenotazionimax;
	}

	public Integer getPrenotazioni() {
		return prenotazioni;
	}

	public void setPrenotazioni(Integer prenotazioni) {
		this.prenotazioni = prenotazioni;
	}


	@Override
	public String toString() {
		return "Volo [partenza=" + partenza + ", arrivo=" + arrivo + ", orario=" + orario + ", aereo=" + aereo + "]";
	}
	
	public void SetNonDisponibile() {
        this.disponibile = false;
    }
	
	public void SetAncoraDisponibile() {
		this.disponibile = true;
	}
    
    public boolean isDisponibile() {
        return disponibile;
    }
    
    private void controllaDisponibilitaPren() {
        if (prenotazioni >= prenotazionimax) {
            this.disponibile = false;
        }
    }
    
    public void aggiungiPrenotazione() {
    	if(prenotazioni < prenotazionimax) {
    	prenotazioni++;
    	controllaDisponibilitaPren();
    }else {
    	System.out.println("Impossibile prenotare, posti pieni");
    }
    }
}
