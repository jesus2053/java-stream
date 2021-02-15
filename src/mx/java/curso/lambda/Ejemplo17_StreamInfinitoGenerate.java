package mx.java.curso.lambda;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Ejemplo17_StreamInfinitoGenerate {
	
	public static void main(String[] args) {
		
		
		System.out.println("---Ejemplo 1 \n");
		
		Stream.generate(() -> {
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			return "Hola mundo";
		})
		.limit(5)
		.forEach(System.out::println);
		
		System.out.println("\n---Ejemplo 2 \n");

		AtomicInteger contador = new AtomicInteger(0);
		
		Stream.generate(() -> {
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			return contador.incrementAndGet();
		})
		.limit(10)
		.forEach(System.out::println);
	}

}
