
public class Elettronica extends Prodotto{
	
	
	public Elettronica(String name, Double price, String categoria) {
		super(name, price, categoria);
	}

	public Elettronica() {
		super();
	}

	@Override
	public Double calculateDiscount() {
		Double prezzo = getPrice();
		Double sconto = prezzo * 0.10;
		if(prezzo > 500) {
			prezzo = prezzo - sconto;
		}
		return prezzo;
	}

}
