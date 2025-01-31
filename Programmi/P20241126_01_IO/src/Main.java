import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) {
		//Costruire un Set di oggetti di tipo Wifi e inserire 100 Wifi casuali
		Set<Wifi> sw = new HashSet<Wifi>();
		//for(int i=0; i<100;i++) {
		//sw.add(Wifi.MakeWifi());
		//}
		
		//Oppure
		IntStream.range(0,100).forEach(i -> sw.add(Wifi.MakeWifi()));
		//System.out.println(sw.toString());
		
		//Come posso scrivere su disco i dati contenuti in sWifi?
        //Scrivere nel file pippo.txt la stringa iniziale del 5 maggio
        //Chiudere il file (il bufferedWriter.close()
        //Appendere al file pippo.txt un pochino di righe della Vispa Teresa
        //Chiudere il file
        //Con un bufferedReader, leggere e stampare tutte le 
        //righe del file pippo.txt

        //Scrivere nel file pippo.txt la stringa iniziale del 5 maggio
//        BufferedWriter foutput = Util.OpenFileForWriting("pippo.txt");
//        try {
//            foutput.write("Ei fu, siccome immobile, ");
//            foutput.close();
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }

        //Appendere al file pippo.txt un pochino di righe della Vispa Teresa
        BufferedWriter foutput = Util.OpenFileForWriting("pippo.txt");
//        try {
//            foutput.write("La vispa Teresa, avea tra l'erbetta");
//            foutput.write("A volo sorpresa gentil farfalletta");
//            foutput.write("E tutta giuliva stringendola viva\ngridava distesa: L'ho presa! L'ho presa!");
//            foutput.close();
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        
        //Scrittura dei wifi su file di testo
        try {
        for (Wifi wifi:sw) {
			foutput.write(wifi.getFrequenza()+";"+ wifi.getId()+";"+wifi.getPassword()+";"+wifi.getProtocollo());
			foutput.newLine();
        }
        foutput.close();
        } catch (IOException e) {
        	e.printStackTrace();
        }
        //Lettura dei wifi da file di testo
        Set<Wifi> wifiSet = new HashSet<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("pippo.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parti = line.split(";");
                if (parti.length == 4) {
                	Double frequenza = Double.parseDouble(parti[0].trim());
                    String id = parti[1].trim();
                    String password = parti[2].trim();
                    String protocollo = parti[3].trim();
                    wifiSet.add(new Wifi(frequenza, id, password, protocollo));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Set:");
        for (Wifi wifi : wifiSet) {
            System.out.println(wifi.getFrequenza()+";"+ wifi.getId()+";"+wifi.getPassword()+";"+wifi.getProtocollo());
        }
        
        ObjectMapper objectMapper = new ObjectMapper();
        Wifi wi = Wifi.MakeWifi();
        String jsonString="";
        try {
            jsonString = objectMapper.writeValueAsString(wi);
            System.out.println(jsonString);
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            Wifi wi2 = objectMapper.readValue(jsonString, Wifi.class);
            System.out.println(wi2);
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
 
	}

}