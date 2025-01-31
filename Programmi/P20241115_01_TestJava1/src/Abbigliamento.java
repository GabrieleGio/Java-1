
public class Abbigliamento extends Prodotto {

	
	public Abbigliamento(String name, Double price, String categoria) {
		super(name, price, categoria);
		
	}

	public Abbigliamento() {
		
	}

	@Override
	public Double calculateDiscount() {
		String categoria = getCategoria();
		Double prezzo = getPrice();
		Double sconto = prezzo * 0.15;
		if(categoria == "Abbigliamento invernale") {
			prezzo = prezzo - sconto;
		}
		return prezzo;
	}

}
