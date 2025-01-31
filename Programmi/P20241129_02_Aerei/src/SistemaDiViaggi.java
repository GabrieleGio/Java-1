import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaDiViaggi {
    private List<Compagnia> compagnieAeree;
    private List<Aeroporto> aeroporti;
    private Agenzia agenzia;

    public SistemaDiViaggi() {
        compagnieAeree = new ArrayList<>();
        aeroporti = new ArrayList<>();
        agenzia = new Agenzia("Agenzia di Viaggi Esempio");
    }

    public void avvia() {
        Scanner scanner = new Scanner(System.in);
        boolean continua = true;

        while (continua) {
            System.out.println("Menu Generale:");
            System.out.println("1. Menu Agenzia");
            System.out.println("2. Menu Aeroporto");
            System.out.println("3. Menu Compagnia Aerea");
            System.out.println("4. Termina Lavoro");
            System.out.print("Seleziona un'opzione: ");
            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    menuAgenzia(scanner);
                    break;
                case 2:
                    menuAeroporto(scanner);
                    break;
                case 3:
                    menuCompagniaAerea(scanner);
                    break;
                case 4:
                    continua = false;
                    // Salva i dati su file
                    break;
                default:
                    System.out.println("Opzione non valida.");
            }
        }
        scanner.close();
    }

    private void menuAgenzia(Scanner scanner) {
        boolean continua = true;
        while (continua) {
            System.out.println("Menu Agenzia:");
            System.out.println("1. Prenotazione Volo");
            System.out.println("2. Cancellazione Volo");
            System.out.println("3. Torna al Menu Principale");
            System.out.print("Seleziona un'opzione: ");
            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    // Logica per prenotare un volo
                    break;
                case 2:
                    // Logica per cancellare un volo
                    break;
                case 3:
                    continua = false;
                    break;
                default:
                    System.out.println("Opzione non valida.");
            }
        }
    }

    private void menuAeroporto(Scanner scanner) {
        boolean continua = true;
        while (continua) {
            System.out.println("Menu Aeroporto:");
            System.out.println("1. Imbarco");
            System.out.println("2. Decollo");
            System.out.println("3. Atterraggio");
            System.out.println("4. Torna al Menu Principale");
            System.out.print("Seleziona un'opzione: ");
            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    // Logica per imbarcare un volo
                    break;
                case 2:
                    // Logica per registrare un decollo
                    break;
                case 3:
                    // Logica per registrare un atterraggio
                    break;
                case 4:
                    continua = false;
                    break;
                default:
                    System.out.println("Opzione non valida.");
            }
        }
    }
    private void menuCompagniaAerea(Scanner scanner) {
        boolean continua = true;
        while (continua) {
            System.out.println("Menu Compagnia Aerea:");
            System.out.println("1. Crea Aereo");
            System.out.println("2. Elimina Aereo");
            System.out.println("3. Aggiungi Volo");
            System.out.println("4. Torna al Menu Principale");
            System.out.print("Seleziona un'opzione: ");
            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    // Logica per creare un aereo
                    break;
                case 2:
                    // Logica per eliminare un aereo
                    break;
                case 3:
                    // Logica per aggiungere un volo
                    break;
                case 4:
                    continua = false;
                    break;
                default:
                    System.out.println("Opzione non valida.");
            }
        }
    }
    // Metodi per salvare e caricare dati da file
}