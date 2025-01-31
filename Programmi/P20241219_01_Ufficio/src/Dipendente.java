import java.util.Date;

public class Dipendente {
    private int idDipendente;
    private String nome;
    private String cognome;
    private Date dataNascita;
    private String posizione;

    // Costruttore
    public Dipendente(int idDipendente, String nome, String cognome, Date dataNascita, String posizione) {
        this.idDipendente = idDipendente;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.posizione = posizione;
    }

    // Getters e Setters
    public int getIdDipendente() {
        return idDipendente;
    }

    public void setIdDipendente(int idDipendente) {
        this.idDipendente = idDipendente;
    }

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

    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getPosizione() {
        return posizione;
    }

    public void setPosizione(String posizione) {
        this.posizione = posizione;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Dipendente{" +
                "idDipendente=" + idDipendente +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataNascita=" + dataNascita +
                ", posizione='" + posizione + '\'' +
                '}';
    }
}

