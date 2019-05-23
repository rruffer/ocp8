package lambdafunctionalinterfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorTest {

	public static void main(String[] args) {

		BinaryOperator<Integer> operator = (n1, n2) -> n1 + n2;
		
		System.out.println(operator.apply(10, 10));
		
	}

}
