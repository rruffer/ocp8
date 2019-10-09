package testes;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * 
 * @author rodolfo.mindtek </br>
 *@link http://iteratrlearning.com/java9/2016/09/13/java9-timeouts-completablefutures.html
 *@link https://www.baeldung.com/java-completablefuture
 */
public class Testes3 {

	public static void main(String[] args) {
		
		try {
			
		CompletableFuture<Integer> timeout = CompletableFuture.supplyAsync(() -> {

			int result = 0;
			
			while (result < 100000000) {
				
				result++;
				System.out.println(result);
			}
			
			return result;
			
		});
		
		
		 int integer = timeout.get(3, TimeUnit.SECONDS);
		 
		 System.out.println("Resultado: " + integer);
		
		
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			System.out.println("acabou");
			e.printStackTrace();
		}
		

	}
	

}
