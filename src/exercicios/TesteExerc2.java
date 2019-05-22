package exercicios;

import static java.lang.System.out;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TesteExerc2 {

	public static void main(String[] args) {

		Stream<Integer> stream2 = Stream.of(1, 2, 3, 4);
		out.println(stream2.peek(out::println).filter(n -> n > 2).findFirst());
		
	}

}
