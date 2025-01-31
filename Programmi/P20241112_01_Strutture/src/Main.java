import java.util.*;
public class Main {

	public static void main(String[] args) {
		/* ho essenzialmente due tipi di liste
		 * LinkedList, ArrayList
		 */
		LinkedList<Integer> li;
		li = new LinkedList<Integer>();
		
		//appendi in fondo
		li.add(7);
		li.add(2);
		li.add(70);
		li.add(30);
		System.out.println(li);
		
		//Il primo elemento
		System.out.println(li.getFirst());
		
		//L'ultimo elemento
		System.out.println(li.getLast());
		
		//elemento i
		System.out.println(li.get(2));
		
		for (Integer i: li) {
			System.out.println(i + " ");
		}
		System.out.println();
		
		//Ora vorrei stampare al contrario
		Collections.reverse(li);
		System.out.println(li);
		
		//Disordinare
		Collections.shuffle(li);
		System.out.println(li);
		
		//Ordinare
		Collections.sort(li);
		System.out.println(li);
		
		Citta roma = new Citta("roma", 0.0, 0.0, 3578922);
		LinkedList<Citta> lc = new LinkedList<Citta>();
		
		lc.add(roma);
		lc.add(new Citta("milano",1.0,1.0,1500000));
		lc.add(new Citta("firenze",1.0,1.0,750000));
		
		System.out.println(lc);
		
		Collections.sort(lc);
		System.out.println(lc);
		
		Collections.shuffle(lc);
		lc.sort(new Comparator<Citta>() {
			@Override
			public int compare(Citta o1, Citta o2) {
				return o1.getNome().compareTo(o2.getNome());
			}
		});
		System.out.println(lc);
		
		
		Pair<String> ps = new Pair<String>("uno","due");
		Pair<Integer> pi = new Pair<Integer>(10,20);
		
	}
	public static <T> List<T> CreaLista(T i1, T i2, T i3)
	{
		LinkedList<T> li = new LinkedList<T>();
		li.add(i1);
		li.add(i2);
		li.add(i3);
		return li;
	}

}


