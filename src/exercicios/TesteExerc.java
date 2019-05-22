package exercicios;

import static java.lang.System.out;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TesteExerc {

	public static void main(String[] args) {

		IntStream ds = IntStream.of(1, 2, 2, 4);
//		Stream<String> ste = ds.boxed().map(Integer::toString);
		Stream<String> ste = ds.boxed().map(i -> Integer.toString(i));
		out.println(ste.distinct().findFirst());
		
		out.println(String.format("%d-%s-%b", 10, "teste", true));
		
		///////////////////////
		
		Stream<String> stream = Stream.of("A", "AB", "ABC", "ABCD");
		String outt = stream.filter(s -> s.length() > 2).filter(s -> s.indexOf("C") > -1).findAny().orElse("None");
		out.println(outt);
		
		///////////
		
		Stream<String> stream2 = Stream.of("A", "B", "C", "D");
		out.println(stream2.peek(out::println).findAny().orElse("NA"));
		
	}

}
