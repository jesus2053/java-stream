package mx.java.curso.lambda;

import java.util.stream.Stream;

import mx.java.curso.lambda.model.Usuario;

public class Ejemplo09_StreamAnyMatch {
	
	public static void main(String[] args) {
		
		
		boolean exite = Stream
				.of("Jesus Nicolas","Jesus Jimenez","Gloria Jiemenez")
				.map( nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
				.peek(System.out::println)
				.anyMatch( u -> u.getNombre().equals("Gloria"));
	
		System.out.println("Esta  : "+exite);

	}

}
