import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Random;

public class Util {
	private static Random rng = new Random();
	private static String alfabeto = "abcdefghijklmnopqrstuvwxyz";
	private static String digit = "0123456789";
	private static String simboli = "-_.:,!?|$%";
	
	
	public static String GetRandomAuthProto() {
		int i = rng.nextInt(4);
		String [] vp = new String[] {"WEP","WPA","WPA2","WPA3"};
		return vp[i];

	}
	
	//Genera una frequenza (Double) compreso tra 1.0^9 e 5.0*10^9
	public static Double GetFrequenza() {
		double k = rng.nextDouble(1000000000.0, 5000000000.0);
		return k;
	}
	
	public static String GetPassword(Boolean isPassword) {
		String all = alfabeto+alfabeto.toUpperCase()+digit;
		if (isPassword) {
			all+=simboli;
		}
		
		//Una password è lunga tra i 12 e i 24 caratteri
		int len = rng.nextInt(12,25);
		StringBuilder ret = new StringBuilder();
		for (int i=0; i<len; i++) {
			ret.append(all.charAt(rng.nextInt(all.length())));
		}
		return ret.toString();
	}
	
	public static BufferedWriter OpenFileForWriting(String nomeFile) {
        try {
            Path path = Path.of(nomeFile);
            BufferedWriter writer = Files.newBufferedWriter(
                    path,
                    Files.exists(path)?StandardOpenOption.TRUNCATE_EXISTING:StandardOpenOption.CREATE);
            return writer;
        } catch (Exception ex) {
            return null;
        }
    }
	
    public static BufferedWriter OpenFileForAppend(String nomeFile) {
        try {
            BufferedWriter writer = Files.newBufferedWriter(
                    Path.of(nomeFile),
                    StandardOpenOption.APPEND);
            return writer;
        } catch (Exception ex) {
            return null;
        }
    }
}
