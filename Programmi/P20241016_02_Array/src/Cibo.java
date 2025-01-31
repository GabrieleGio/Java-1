
public class Cibo {
	private String nome;
	private double calorie;
	private double peso;
	
	public Cibo(String nome, double calorie, double peso) {
		super();
		this.nome = nome;
		this.calorie = calorie;
		this.peso = peso;
	}
	//Spesso conviene avere un costruttore vuoto
	public Cibo() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getCalorie() {
		return calorie;
	}
	public void setCalorie(double calorie) {
		this.calorie = calorie;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
