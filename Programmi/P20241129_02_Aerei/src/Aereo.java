
public class Aereo {
	private String id;
	private String modello;
    private int posti;
    
    public Aereo(String id, String modello, int posti) {
    	this.id = id;
        this.modello = modello;
        this.posti = posti;
    }
    
    public Aereo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getModello() {
        return modello;
    }
    public int getPosti() {
        return posti;
    }
    @Override
    public String toString() {
        return "Aereo{" +
                "modello='" + modello + '\'' +
                ", capacita=" + posti +
                '}';
    }
}
