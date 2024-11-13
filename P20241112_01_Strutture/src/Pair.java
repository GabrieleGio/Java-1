//Crea una classe che contiene coppie di tipi di dato generici
public class Pair <tipo> {
	private tipo first;
	private tipo second;
	public Pair(tipo first, tipo second) {
		super();
		this.first = first;
		this.second = second;
	}
	public Pair() {
		super();
	}
	public tipo getFirst() {
		return first;
	}
	public void setFirst(tipo first) {
		this.first = first;
	}
	public tipo getSecond() {
		return second;
	}
	public void setSecond(tipo second) {
		this.second = second;
	}
	@Override
	public String toString() {
		return "Pair [first=" + first + ", second=" + second + "]";
	}
	
}
