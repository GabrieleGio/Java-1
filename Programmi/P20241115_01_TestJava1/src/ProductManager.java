import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class ProductManager implements Ordinabile {
	private List<Prodotto> prodotti;

	public ProductManager() {
		super();
		this.prodotti = new ArrayList<>();
	}

	public void aggiuntaProdotti(Prodotto prodotto) {
		prodotti.add(prodotto);
		System.out.println("Prodotto: " + prodotto.getName() + " aggiunto con successo");
	}
	
	public void visualizzaProdotti() {
		for(Prodotto prodotto : prodotti) {
			System.out.println(prodotto);
		}
	}
	
	@Override
	public List<Prodotto> sortByPrice(List<Prodotto> prodotti2) {
        Collections.sort(prodotti, new Comparator<Prodotto>() {
            @Override
            public int compare(Prodotto p1, Prodotto p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });
        return prodotti;
	}
	
	public void visualizzaProdottiOrdinati() {
		sortByPrice(prodotti);
		visualizzaProdotti();
	}
	
}

