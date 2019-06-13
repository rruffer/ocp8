package exercicios;

import java.util.stream.Stream;

public class TesteExec5 {

	public static void main(String[] args) {

		Stream<Double> stream = Stream.of(2.2, 2.8, 2.5);
		
		Stream<Integer> out = stream.mapToInt(Double::intValue).boxed();
		
		out.forEach(System.out::println);
		

	}

}
