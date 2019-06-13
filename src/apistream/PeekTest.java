package apistream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekTest {

	public static void main(String[] args) {
		
		Stream.of("the", "good", "bad", "ungly")
		//.peek(s ->  System.out.println("Lista valor: " +  s))
		.filter(e -> e.length() > 3)
		.peek(s -> System.out.println("Filtro valor: " +  s))
		.map(String::toUpperCase)
		.peek(s -> System.out.println("Map valor " + s))
		.collect(Collectors.toList());

	}

}
