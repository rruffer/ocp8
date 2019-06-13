package apistream;

import static java.lang.System.out;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class OptionalTest {

	public static void main(String[] args) {
		
		OptionalInt integer = IntStream.of(10, 20, 30, 40).filter(n -> n > 00).min();
		
/*		if(integer.isPresent()) {
			out.println(integer.getAsInt());			
		} else {
			out.println("Sem valor");						
		}*/
		
		integer.ifPresent(out::println);
		
		int result = IntStream.of(10, 20, 30, 40).filter(n -> n > 50).min().orElse(0);
		out.println(result);
		result = IntStream.of(10, 20, 30, 40).filter(n -> n > 50).min().orElseGet(() -> 10);
		out.println(result);
//		result = IntStream.of(10, 20, 30, 40).filter(n -> n > 50).min().orElseThrow(Exception::new);
//		result = IntStream.of(10, 20, 30, 40).filter(n -> n > 50).min().orElseThrow(() -> new Exception("teste custom"));
		out.println(result);
		
		Optional<String> empty = Optional.empty();
		out.println(empty.orElse("Vazio"));
		Optional<String> string = Optional.of("teste");
		out.println(string.get());
		Optional<String> empty2 = Optional.ofNullable(null);
		out.println(empty2.orElse("Nulo"));

	}

}
