package lambdafunctionalinterfaces;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.stream.IntStream;

class Product {
	
	private double price = 0.0;
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void printPrice() {
		System.out.println(price);
		
	}
	
}

public class ConsumerTest {

	public static void main(String[] args) {

		Consumer<Product> updatePrice =  p -> p.setPrice(5.9);
		
		Product product = new Product();
		
		updatePrice.accept(product);
		
		product.printPrice();
		
		ObjIntConsumer<Integer> updatePrice2 = (i,l) -> System.out.println(i+l);
		updatePrice2.accept(10, 10);
		
		test();
		
	}

	private static void test() {
		
		IntStream stream = IntStream.range(1, 3);
		
		IntConsumer consumer = System.out::print;
		consumer.accept(stream.sum());
		
	}

	
	
}
