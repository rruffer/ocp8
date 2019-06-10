package exercicios;

import java.util.stream.Stream;

public class TesteExec3 {

	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("A", "B", "C", "D");
		
		//stream.peek(System.out::print).findAny().orElse("NA");
		
		System.out.println(stream.peek(System.out::print).findAny().orElse("NA"));

	}

}
