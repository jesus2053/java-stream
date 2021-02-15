package mx.java.curso.lambda;

import java.util.stream.Stream;

import mx.java.curso.lambda.model.Usuario;

public class Ejemplo15_StreamFlatMap {
	
	public static void main(String[] args) {
		
		
		Stream<Usuario> nombres2 = Stream
				.of("Jesus Nicolas","Jesus Jimenez","Gloria Jiemenez")
				.map( nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
				.filter( u -> u.getNombre().equals("Jesus"));
	}

}
