
public class Main {

	int somma = Somma(7,20);
	
	private int Somma(int inizio, int fine) {
		//Questo if serve a terminare la ricorsione
		if (inizio == fine) {
	        return inizio;
	    }
	   
	    return inizio + Somma(inizio+1, fine);
	} 
}
