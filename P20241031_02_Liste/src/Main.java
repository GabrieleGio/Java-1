import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		//Ho definito una variabile che si chiama li
		//ed è una LinkedList di numeri interi
		LinkedList<Integer> li = new LinkedList<Integer>();
		
		li.add(7);
		li.add(9);
		li.add(2);
		for (var i: li) {
			//var si può usare in modo generico (prende il tipo della variabile assegnata)
			System.out.println(i);
		}
		ArrayList<Integer> lai = new ArrayList<Integer>();
	}

}
