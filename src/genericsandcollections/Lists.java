package genericsandcollections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import static java.lang.System.out;

public class Lists {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		int count = list.size();
		
		Integer i = list.get(0);
		
		////////////////////////////////////////
		
		Set<Integer> setList = new TreeSet<>();
		setList.add(4);
		setList.add(3);
		setList.add(2);
		setList.add(2);// not print
		
		out.println(setList);
		
		////////////////////////////////////////
		
		Map<String, Integer> tm = new TreeMap<>();
		tm.put("A", 10);
		tm.put("C", 40);
		tm.put("B", 20);
		
		Set<Entry<String, Integer>> set = tm.entrySet();
		
		Iterator<Entry<String, Integer>> iterator = set.iterator();
		
		while (iterator.hasNext()) {
			Entry<String, Integer> me = iterator.next();
			out.println(me.getKey() + " " + me.getValue());
			
		}
		
		Integer ii = tm.get("A");
		
		out.println(ii);
		
		////////////////////////////////////////

		Deque<Integer> d = new ArrayDeque<Integer>();
		
		d.add(1);
		d.addFirst(2);
		d.addLast(3);
		
		d.forEach(out::println);
		
	    //Get elements
	    Integer firstElement1 = d.element(); //espia o elemento na cabeça sem tirar o elemento da fila (a exceção é que a fila está vazia)
	    out.println(firstElement1);
	    Integer firstElement2 = d.peek(); //espiar o elemento na cabeceira sem tirar o elemento da fila (retorna null é a fila vazia)
	    out.println(firstElement2);
	    Integer firstElement3 = d.getFirst();//obtém o primeiro elemento (a exceção lança é a fila vazia)
	    out.println(firstElement3);
	    Integer firstElement4 = d.peekFirst();//get first element (returns null is the queue is empty)
	    out.println(firstElement4);
	    Integer lastElement1  = d.getLast();//get last element (throws exception is the queue is empty)
	    out.println(lastElement1);
	    Integer lastElement2  = d.peekLast();//get last element (returns null is the queue is empty)
	    out.println(lastElement2);

	    //Remove elements
	    Integer element1 = d.remove(); //recupera e remove a cabeça da fila
	    out.println(element1);
	    Integer element2 = d.removeFirst(); //recupera e remove o primeiro elemento da fila
	    out.println(element2);
	    Integer element3  = d.removeLast(); //recupera e remove o último elemento da fila
	    out.println(element3);
		
	}
	
}
