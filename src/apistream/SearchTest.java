package apistream;

import static java.lang.System.out;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SearchTest {

	public static void main(String[] args) throws Exception {
		
		Optional<Integer> first = Stream.of(1, 10, 5, 3, 13, 20).filter(i -> i % 2 == 0).findFirst(); //returns 2
		Optional<Integer> any = Stream.of(1, 10, 5, 3, 13, 20).filter(i -> i % 2 == 0).findAny(); //can return 10 or 20
		boolean any2 = Stream.of(1, 10, 5, 3, 13, 20).anyMatch(i -> i % 3 == 0); //returns true
		boolean all = Stream.of(1, 10, 5, 3, 13, 20).allMatch(i -> i % 2 == 0); //returns false
		boolean none = Stream.of(1, 10, 5, 3, 13, 20).noneMatch(i -> i % 6 == 0); //returns true
		
		out.println(first.get());
		out.println(any.get());
		out.println(any2);
		out.println(all);
		out.println(none);
		

	}

}
