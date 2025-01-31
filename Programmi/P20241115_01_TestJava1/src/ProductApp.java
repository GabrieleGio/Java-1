
public class ProductApp {

	public static void main(String[] args) {
		ProductManager PM1 = new ProductManager();
		Elettronica elettronica1 = new Elettronica("Geforce RTX 3080",300.0,"Computer");
		Elettronica elettronica2 = new Elettronica("IPhone 37", 9000.0,"Smartphone");
		Abbigliamento abbigliamento1 = new Abbigliamento("Guanti da neve",15.0, "Accessori");
		Abbigliamento abbigliamento2 = new Abbigliamento("Nike Air Force 1", 150.0, "Scarpe");
		PM1.aggiuntaProdotti(elettronica1);
		PM1.aggiuntaProdotti(elettronica2);
		PM1.aggiuntaProdotti(abbigliamento1);
		PM1.aggiuntaProdotti(abbigliamento2);
		
		PM1.visualizzaProdotti();
		System.out.println("Prodotti Ordinati Metodo 1");
		PM1.visualizzaProdottiOrdinati();
		
		
	}

}
