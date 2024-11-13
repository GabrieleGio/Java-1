
public class Persona {
	private String nome;
	private Double temperatura;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getTemperaturaCelsius() {
		return temperatura;
	}

	public void setTemperaturaCelsius(Double temperatura) {
		this.temperatura = temperatura;
	}
	public double getTemperaturaFarhenheit() {
		return temperatura*9.0/5.0+32.0;
	}
	public void setTemperaturaFarhenheit(Double temperatura) {
		this.temperatura = temperatura-32.0/9.0*5.0;
	}
	
	
}
