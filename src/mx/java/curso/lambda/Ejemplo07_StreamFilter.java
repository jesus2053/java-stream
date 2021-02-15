package mx.java.curso.lambda;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import mx.java.curso.lambda.model.Usuario;

public class Ejemplo07_StreamFilter {
	
	public static void main(String[] args) {
		
		System.out.println("-----------Filter 1--------------");

		
		
		
				
		Stream<Usuario> nombres = Stream
				.of("Jesus Nicolas","Jesus Jimenez","Gloria Jiemenez")
				.map( nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
				.filter( u -> u.getNombre().equals("Jesus"));
				//.peek(System.out::println);
		
		List<Usuario> lista =  nombres.collect(Collectors.toList());
		lista.forEach(System.out::println);
		
		
		
		
		System.out.println("-----------Filter 2--------------");

		
		
		
		Stream<Usuario> nombres2 = Stream
				.of("Jesus Nicolas","Jesus Jimenez","Gloria Jiemenez")
				.map( nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
				.filter( u -> u.getNombre().equals("Jesus"));
		 Optional<Usuario> user =nombres2.findFirst();
		
		System.out.println(user.get());
		
		
		
		
		
		
		System.out.println("-----------Filter 3--------------");

		
		
		
		
		Usuario usuario = Stream
				.of("Jesus Nicolas","Jesus Jimenez","Gloria Jiemenez")
				.map( nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1],1 ))
				.filter( u -> u.getId().equals(1))
				.findFirst().get();
		
		System.out.println(usuario);
		
	}

}
