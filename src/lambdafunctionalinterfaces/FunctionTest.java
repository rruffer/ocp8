package lambdafunctionalinterfaces;

import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class FunctionTest {

	public static void main(String[] args) {
		
		int n = 5;
		modifyValue(n, val -> val * 10);
		modifyValue(n, val -> val * 100);
		
		modifyValue2(n, val -> val * 10);
		modifyValue2(n, val -> val * 100);
		
		test();

	}
	
	public static void modifyValue(int v, Function<Integer, Integer> function) {
		int result = function.apply(v);
		System.out.println(result);

	}
	
	public static void modifyValue2(int v, ToIntFunction<Integer> function) {
		int result = function.applyAsInt(v);
		System.out.println(result);
		
	}
	
	public static void test() {
		Stream<Double> stream = Stream.of(10.0, 20.1, 30.2);
		
		ToIntFunction<Double> lif = t -> t.intValue();
		
		Stream<Integer> stream2 = stream.mapToInt(lif).boxed();
		
		stream2.forEach(System.out::print);
	}

}
