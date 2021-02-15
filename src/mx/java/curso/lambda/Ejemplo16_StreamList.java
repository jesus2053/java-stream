package mx.java.curso.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import mx.java.curso.lambda.model.Usuario;

public class Ejemplo16_StreamList {
	
	public static void main(String[] args) {
		
		
		List<Usuario> lista =  new ArrayList<>();
		lista.add(new Usuario("Jesus","Nicolas"));
		lista.add(new Usuario("Hayden","Cosme"));
		lista.add(new Usuario("Ely","Cosme"));
		lista.add(new Usuario("Belem","Nicolas"));
		lista.add(new Usuario("Gloria","Jimenez"));
		
		
		lista.stream()
			.map(a -> a.getNombre().toUpperCase()
			.concat(" ")
			.concat(a.getApellido().toUpperCase()))
			.flatMap( nombre -> {
				if(nombre.contains("Cosme".toUpperCase())) {
					return Stream.of(nombre);
				}
				return Stream.empty();
			}).forEach(System.out::println); 
		
		System.out.println("\n");
		
		
		Stream<String>  nombres = lista.stream()
				.map(a -> a.getNombre().toUpperCase()
				.concat(" ")
		.        concat(a.getApellido().toUpperCase()))
				.flatMap( nombre -> {
					if(nombre.contains("Cosme".toUpperCase())) {
						return Stream.of(nombre);
					}
					return Stream.empty();
				})
				.map(String::toLowerCase)
				.peek(System.out::println);
		
		
		System.out.println("Resultado : "+nombres.count());
		
		
					
		
		
		
	}

}
