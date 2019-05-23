package lambdafunctionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> unary = v -> v * 10;
		
		Function<Integer, Integer> function = v -> v * 10;
		
		System.out.println(unary.apply(10));
		System.out.println(function.apply(10));
		
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.replaceAll(i -> i * 10);

		list.forEach(System.out::println);
		

	}

}
