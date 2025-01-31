
public class Pitagora {

	public static void main(String[] args) {


		//Calcolo dell'ipotenusa di un triangolo rettangolo

		 /*

		 * Sia dato un triangolo rettangolo i cui cateti misurano rispettivamente 10.345 e 20.415 cm

		 * Calcolare

		 * 1) la lunghezza dell'ipotenusa

		 * 2) il perimetro del triangolo rettangolo

		 * 3) L'area del triangolo rettangolo

		 * NB:

		 * a) Teorema di pitagora

		 * dati c1 w c2 cateti di un triangolo rettangolo, l'ipotenusa è la radice quadrata della somma dei quadrati dei cateti

		 * b) In java la rqdica quadrata si calcola con Math.sqrt(numero)

		 */
		double cateto1 = 10.345;
		double cateto2 = 20.415;
		double ipotenusa = 0;
		double perimetro = 0;
		double area = 0;
		
		ipotenusa = Math.sqrt((cateto1 * cateto1)+(cateto2 * cateto2));
		perimetro = cateto1 + cateto2 + ipotenusa;
		area = (cateto1 * cateto2) / 2;
		
		System.out.println("Ipotenusa = "+ ipotenusa);
		System.out.println("Perimetro = "+ perimetro);
		System.out.println("Area = "+ area);

	}

}
