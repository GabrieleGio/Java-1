
public class Autoveicolo {
	private int cilindrata;
	private int consumo;
	private int velocitamedia;
	private int serbatoio;
	private String colore;
	private Double prezzo;
	public int getCilindrata() {
		return cilindrata;
	}
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	public int getConsumo() {
		return consumo;
	}
	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}
	public int getVelocitamedia() {
		return velocitamedia;
	}
	public void setVelocitamedia(int velocitamedia) {
		this.velocitamedia = velocitamedia;
	}
	public int getSerbatoio() {
		return serbatoio;
	}
	public void setSerbatoio(int serbatoio) {
		this.serbatoio = serbatoio;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public Double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}
	public Autoveicolo(int cilindrata, int consumo, int velocitamedia, int serbatoio, String colore, Double prezzo) {
		super();
		this.cilindrata = cilindrata;
		this.consumo = consumo;
		this.velocitamedia = velocitamedia;
		this.serbatoio = serbatoio;
		this.colore = colore;
		this.prezzo = prezzo;
	}
	public Double distanzapercorsa(Double ore) {
		return velocitamedia*ore;
	}
	
	
}
