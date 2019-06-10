package exercicios;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class TesteExec4 {

	public static void main(String[] args) {
		
/*		String dados = "ab";
		char charAt = dados.charAt(1);
		int num = (int) charAt;

		System.out.println((int) "ab".charAt(1));*/
		
		IntStream str = IntStream.range(1, 3);
		
		IntConsumer con = System.out::println;
		
		con.accept(str.sum());
		

	}

}
