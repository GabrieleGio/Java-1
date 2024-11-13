import java.util.Arrays;

public class Aereo {
	private String codice;
	private String modello;
    private boolean[] posti;

    public Aereo(String codice, String modello, int numeroPosti) {
    	this.codice = codice;
        this.modello = modello;
        this.posti = new boolean[numeroPosti];
    }

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public boolean[] getPosti() {
		return posti;
	}

	public void setPosti(boolean[] posti) {
		this.posti = posti;
	}

	@Override
	public String toString() {
		return "Aereo [codice=" + codice + ", modello=" + modello + ", posti=" + Arrays.toString(posti) + "]";
	}
	
	public boolean prenotaPosto(int numeroPosto) {
        
        if (numeroPosto < 0 || numeroPosto >= posti.length) {
            System.out.println("Numero di posto non valido.");
            return false;
        }

        if (posti[numeroPosto]) {
            System.out.println("Il posto " + numeroPosto + " è già prenotato.");
            return false;

        } else {
            
            posti[numeroPosto] = true;
            System.out.println("Posto " + numeroPosto + " prenotato con successo.");
            return true;
        }
    }
	
    
    public void visualizzaPosti() {
        for (int i = 0; i < posti.length; i++) {
            System.out.println("Posto " + i + ": " + (posti[i] ? "Prenotato" : "Disponibile"));
        }

    }
   
}
