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
	    Integer firstElement1 = d.element(); //espia o elemento na cabe�a sem tirar o elemento da fila (a exce��o � que a fila est� vazia)
	    out.println(firstElement1);
	    Integer firstElement2 = d.peek(); //espiar o elemento na cabeceira sem tirar o elemento da fila (retorna null � a fila vazia)
	    out.println(firstElement2);
	    Integer firstElement3 = d.getFirst();//obt�m o primeiro elemento (a exce��o lan�a � a fila vazia)
	    out.println(firstElement3);
	    Integer firstElement4 = d.peekFirst();//get first element (returns null is the queue is empty)
	    out.println(firstElement4);
	    Integer lastElement1  = d.getLast();//get last element (throws exception is the queue is empty)
	    out.println(lastElement1);
	    Integer lastElement2  = d.peekLast();//get last element (returns null is the queue is empty)
	    out.println(lastElement2);

	    //Remove elements
	    Integer element1 = d.remove(); //recupera e remove a cabe�a da fila
	    out.println(element1);
	    Integer element2 = d.removeFirst(); //recupera e remove o primeiro elemento da fila
	    out.println(element2);
	    Integer element3  = d.removeLast(); //recupera e remove o �ltimo elemento da fila
	    out.println(element3);
		
	}
	
}
