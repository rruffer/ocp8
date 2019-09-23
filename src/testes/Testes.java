package testes;

import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Supplier;

public class Testes {

	public static void main(String[] args) {
		
		try {
			
		CompletableFuture<Void> timeout = CompletableFuture.supplyAsync(() -> {

			while (true) {
				System.out.println("teste...");
			}
			
		});
		
		timeout.get(10, TimeUnit.SECONDS);
		
		System.out.println("teste");
		
		if(timeout.isCancelled()) {
			System.out.println("acabou");
		}
		
		
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			System.out.println("acabou");
			e.printStackTrace();
		}
		

	}
	

}
