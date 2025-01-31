
public class Main {

	public static void main(String[] args) {
		//Per prima cosa tolgo tutti gli spazi bianchi
		String esempio = " 123 + 876 ";
		esempio = esempio.replaceAll(" ", "");
		System.out.println(esempio);
		
		//poi provo a separare gli operandi (ci sarà uno split?)
		String[] operandi = esempio.split("(?<=[-+*/])|(?=[-+*/])");
		for (String s: operandi) {
			System.out.println(s);
		}
		//poi provo a estrarre l'operatore
		String[] voperatore = esempio.split("[0-9]+");
		for (String s: voperatore) {
			System.out.println("<" + s + ">");
		}
		//Quindi l'operatore sarà al secondo posto del vettore voperatori
		String operatore = voperatore[1];
		
		//ora avete operandi e operatore, potete eseguire i calcoli
		if (esempio.matches("\\d+")) {

            // Se è un solo operando
            int valore = Integer.parseInt(esempio);
            System.out.println("Risultato: " + valore);

        } else {
        	int operando1 = Integer.parseInt(operandi[0]);
        	int operando2 = Integer.parseInt(operandi[2]);
        	int risultato = 0;
            switch (operatore) {
            
                case "+":
                    risultato = operando1 + operando2;
                    break;
                    
                case "-":
                    risultato = operando1 - operando2;
                    break;
                    
                case "*":
                    risultato = operando1 * operando2;
                    break;
                    
                case "/":
                    if (operando2 != 0) {
                        risultato = operando1 / operando2;

                    } else {
                        System.out.println("Errore: divisione per zero.");
                        return;
                    }
                    break;

                default:
                    System.out.println("Operatore non riconosciuto.");
                    return;
            }
            System.out.println("Risultato: " + risultato);
        }
	}
}
