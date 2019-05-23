package lambdafunctionalinterfaces;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		
		int n = 3;
		display(() -> n + 10);
		display(() -> n + 100);

		display2(() -> n + 10);
		display2(() -> n + 100);
	}

	private static void display(Supplier<Integer> arg) {

		System.out.println(arg.get());
		
	}
	
	private static void display2(IntSupplier arg) {
		
		System.out.println(arg.getAsInt());
		
	}

}
