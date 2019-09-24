package testes;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * 
 * @author rodolfo.mindtek </br>
 *{@link http://iteratrlearning.com/java9/2016/09/13/java9-timeouts-completablefutures.html}
 */
public class Testes {

	public static void main(String[] args) {
		
		try {
			
		CompletableFuture<Void> timeout = CompletableFuture.supplyAsync(() -> {

			while (true) {
				//System.out.println("teste...");
			}
			
		});
		
		System.out.println(timeout.getNumberOfDependents());
		
		timeout.get(10, TimeUnit.SECONDS);
		
		
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			System.out.println("acabou");
			e.printStackTrace();
		}
		

	}
	

}
