package apistream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class CalculationMethods {

	public static void main(String[] args) {

		OptionalInt max = IntStream.of(1, 34, 667, 3, 32, 23).max(); // max() returns 667

		OptionalInt min = IntStream.of(1, 34, 667, 3, 32, 23).min(); // min() returns 1

		OptionalDouble average = IntStream.of(1, 34, 667, 3, 32, 23).average(); // returns 126.66

		int sum = IntStream.of(1, 34, 667, 3, 32, 23).sum(); // returns 760
		
		System.out.println(max.getAsInt());
		System.out.println(min.getAsInt());
		System.out.println(average.getAsDouble());
		System.out.println(sum);
		
	}

}
