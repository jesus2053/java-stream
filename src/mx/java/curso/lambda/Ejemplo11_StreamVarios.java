package mx.java.curso.lambda;

import java.util.stream.Stream;

import mx.java.curso.lambda.model.Usuario;

public class Ejemplo11_StreamVarios {
	
	public static void main(String[] args) {
		
		System.out.println("-----------count--------------");

		
		long numeroElementos = Stream
				.of("Jesus Nicolas","Jesus Jimenez","Gloria Jiemenez")
				.map( nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
				.peek(System.out::println)
				.count();
	
		System.out.println("Numero Elementos : "+numeroElementos);
		
		
		
		
	}

}
