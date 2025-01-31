import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Random rng = new Random();
		
		Queue<Integer> qi = new LinkedList<Integer>();
		LinkedList<Integer> li = new LinkedList<Integer>();
		qi.add(9);
		qi.add(8);
		qi.add(11);
		qi.add(3);
		li.add(3);
		li.add(2);
		li.add(1);
		System.out.println("Queue:");
		System.out.println(qi);
		System.out.println("Lista:");
		System.out.println(li);
		System.out.println("Tolgo il primo numero in coda:");
		System.out.println(qi.poll());
		
		while (rng.nextInt(0, 100) > 5) {
			qi.add(rng.nextInt(0, 1000));
		}
		
		//stampo la coda un elemento per volta e contemporaneamente
		//tolgo gli elementi stampati
		System.out.println("Stampo la coda un elemento per volta \n e tolgo gli elementi stampati");
		while(!qi.isEmpty()) {
			System.out.println(qi.poll());
		}
		
		while (rng.nextInt(0, 100) > 5) {
			qi.add(rng.nextInt(0, 1000));
		}

		//Per scandire una collezione
		System.out.println("Scandisco la collezione:");
		for (var x: qi) {
			System.out.println(x);
		}
		//Altro modo per scandire
		System.out.println("Altro modo per scandire:");
		Iterator it = qi.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//Altro modo ancora usando gli stream
		System.out.println("Altro modo ancora, più complesso");
		qi.stream().forEach(x -> System.out.println(x));
		
		Vai(10);
		//Ora vediamo come funziona lo Stack
		Stack<Integer> si = new Stack<Integer>();
		//Aggiungo numeri allo stack
		si.push(100);
		si.push(200);
		si.push(300);
		System.out.println("Stampo lo stack:");
		System.out.println(si);
		System.out.println("Tolgo l'ultimo numero dello stack:");
		System.out.println(si.pop());
	}

	private static double Vai(int i) {
		double b = Ok(1);
		System.out.println(b);
		return b;
		
	}

	private static double Ok(int i) {
		double a = Math.pow(i, 12);
		return a;
	}

}
