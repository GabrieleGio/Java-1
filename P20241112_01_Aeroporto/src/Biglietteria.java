import java.util.ArrayList;
import java.util.List;

public class Biglietteria {
    private String codice;
    private String nome;
    private Compagnia compagnia1;
    private Compagnia compagnia2;

    public Biglietteria(String codice, String nome, Compagnia compagnia1, Compagnia compagnia2) {
        this.codice = codice;
        this.nome = nome;
        this.compagnia1 = compagnia1;
        this.compagnia2 = compagnia2;
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

    public Compagnia getCompagnia1() {
        return compagnia1;
    }

    public void setCompagnia1(Compagnia compagnia1) {
        this.compagnia1 = compagnia1;
    }

    public Compagnia getCompagnia2() {
        return compagnia2;
    }

    public void setCompagnia2(Compagnia compagnia2) {
        this.compagnia2 = compagnia2;
    }

    @Override
    public String toString() {
        return "Biglietteria [codice=" + codice + ", nome=" + nome + ", compagnia1=" + compagnia1.getNome() + ", compagnia2="
                + compagnia2.getNome() + "]";
    }

    public void prenotaPosto(String codiceAereo, int numeroPosto) {
        
        for (Aereo aereo : compagnia1.getAerei()) {
            if (aereo.getCodice().equals(codiceAereo)) {
                aereo.prenotaPosto(numeroPosto);
                return;
            }
        }

        
        for (Aereo aereo : compagnia2.getAerei()) {
            if (aereo.getCodice().equals(codiceAereo)) {
                aereo.prenotaPosto(numeroPosto);
                return;
            }
        }

        System.out.println("Aereo con codice " + codiceAereo + " non trovato.");
    }
}