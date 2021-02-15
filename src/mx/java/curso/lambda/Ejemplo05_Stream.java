package mx.java.curso.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ejemplo05_Stream {
	
	public static void main(String[] args) {
		
		Stream<String> nombres = Stream.of("Jesus","Roberto","Gloria");
		nombres.forEach(System.out::println);
		
		String[] arr = {"Jesus","Roberto","Gloria"};
		Stream<String> nombres2 = Arrays.stream(arr);
		nombres2.forEach(System.out::println);
		
		
		Stream<String>nombre3 = Stream.<String>builder()
				.add("Pato")
				.add("Pepe")
				.build();
		nombre3.forEach(System.out::println);
		
		List<String> lista = new ArrayList<>();
		lista.add("Carro1");
		lista.add("carro2");
		
		lista.forEach(System.out::println);
		

		
	}

}
