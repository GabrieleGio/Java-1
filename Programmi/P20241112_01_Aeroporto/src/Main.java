import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
 
public class Main {
 
public static void main(String[] args) {

/*
* Definire una classe Aereo con numero di posti fisso (vettore di booleani)
* Definire una classe Compagnia che gestisce N aerei, con N dinamico nel senso che non si conosce a priori ma ogni tanto viene aggiunto un nuovo aereo
* Definire una classe Biglietteria che gestisce due Compagnie e che consente di prenotare i posti su un aereo
* Nel main
* 1) creare due compagnie
* 2) aggiungere le due compagnie alla agenzia
* 3) aggiungere qualche aereo a ogni compagnia
* 4) realizzare un menu per
* 1) prenotare posto su un aereo
* 2) Stampare per ogni compagnia e per ogni aereo i posti prenotati e il numero di posto ancora disponibili
* 
* francorcr@hotmail.it
*/
	Scanner scanner = new Scanner(System.in);

    
    Compagnia compagnia1 = new Compagnia("AA12","Alitalia");

    Compagnia compagnia2 = new Compagnia("AB13","Ryanair");


    
    Aereo aereo1 = new Aereo("A001","Boeing747",600);
    Aereo aereo2 = new Aereo("A002","AirbusA320",500);
    Aereo aereo3 = new Aereo("B001","Boeing737",250);
    Aereo aereo4 = new Aereo("B002","AirbusA350",300);

    compagnia1.aggiungiAereo(aereo1);
    compagnia1.aggiungiAereo(aereo2);
    compagnia2.aggiungiAereo(aereo3);
    compagnia2.aggiungiAereo(aereo4);
    
    Biglietteria biglietteria = new Biglietteria("B001", "Biglietteria Centrale", compagnia1, compagnia2);
    
    int scelta;
    do {
        System.out.println("\nMenu:");
        System.out.println("1. Prenotare posto su un aereo");
        System.out.println("2. Stampare lo stato dei posti");
        System.out.println("3. Uscire");
        System.out.print("Scegli un'opzione: ");
        scelta = scanner.nextInt();
        switch (scelta) {
            case 1:
                
                System.out.print("Inserisci il codice dell'aereo: ");
                String codiceAereo = scanner.next();
                System.out.print("Inserisci il numero del posto da prenotare: ");
                int numeroPosto = scanner.nextInt();
                biglietteria.prenotaPosto(codiceAereo, numeroPosto);
                break;

            case 2:
            	
                System.out.println("Stato dei posti per " + compagnia1.getNome() + ":");

                for (Aereo aereo : compagnia1.getAerei()) {
                    System.out.println("Aereo " + aereo.getCodice() + ":");
                    aereo.visualizzaPosti();
                }
                System.out.println("Stato dei posti per " + compagnia2.getNome() + ":");

                for (Aereo aereo : compagnia2.getAerei()) {
                    System.out.println("Aereo " + aereo.getCodice() + ":");
                    aereo.visualizzaPosti();
                }
                break;

            case 3:
                System.out.println("Uscita dal programma...");
                break;

            default:
                System.out.println("Opzione non valida. Riprova.");
                break;
        }

    } while (scelta != 3);

    scanner.close();
}
 
}
