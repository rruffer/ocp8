package genericsandcollections;

class Test<T> {
	void m (T arg) {
		
	}
}

public class GenericClass {

	public static void main(String[] args) {
		
		Test<String> test1 = new Test<>();
		test1.m("");

		Test<Integer> test2 = new Test<>();
		test2.m(1);

	}

}
