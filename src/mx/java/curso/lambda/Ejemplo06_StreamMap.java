package mx.java.curso.lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import mx.java.curso.lambda.model.Usuario;

/**
 * Map permite modificar un flujo de datos y convertirlo  a mayusculas o minusculas, convertirlo
 * a otro tipo de datos etc, pero es importante mencionar que es inmutable, por lo tanto cada vez que 
 * invoquemos un operador lo que hace es retornar una nueva instancia de un stream  con el nuevo flujo de
 * datos pero el original no sufre cambios
 * 
 * Map siempre returna un valor
 *    
 * 
 * collect : o recolectar permite convertir  un tipo de lista por ejemplo string
 */

public class Ejemplo06_StreamMap {
	
	public static void main(String[] args) {
		
		System.out.println("-----------Forma 1--------------");
		
		
		
		
		
		Stream<String> nombres = Stream
				.of("Jesus","Roberto","Gloria")
				.peek(System.out::println)
				.map(nombre -> {
					return nombre.toUpperCase();
				});

		nombres.forEach(System.out::println);
		
		
		
		
		
		
		System.out.println("-----------Forma 2--------------");
		
		
		
		
		
		
		Stream<String> nombres2 = Stream
				.of("Jesus","Roberto","Gloria")
				.map(nombre -> {
					return nombre.toUpperCase();
				})
			   .peek(System.out::println)
			   .map(nombre ->{
				   return nombre.toLowerCase();
			   })
			   .peek(System.out::println);

		nombres2.forEach(System.out::println);

		
		
		
		
		
		
		System.out.println("-----------Forma 3 simplificada--------------");
		
		
		
		
		
		Stream<String> nombres3 = Stream
				.of("Casa1","Casa2","Casa3")
				.map(String::toUpperCase)
			    .peek(System.out::println)
			   .map( String::toLowerCase);

		nombres3.forEach(System.out::println);
		
		
		
		
		
		
		System.out.println("-----------Forma 4  Lista--------------");
		
		
		
		
		
		Stream<String> nombres4 = Stream
				.of("Spiderman","Batman","Hulk")
				.map(String::toUpperCase)
				.peek(System.out::println)
			    .map( String::toLowerCase);

		List<String> lista =  nombres4.collect(Collectors.toList());
		lista.forEach(System.out::println);
		
		
		
		
		
		
		System.out.println("-----------Forma 5 convertir un flujo de datos a otro tipo de datos--------------");

		
		
		
		
		Stream<Usuario> nombres5 = Stream
				.of("Peter Parker","Bruno Dias","Carlos Barner")
				.map( nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
				.peek(System.out::println)
			    .map( usuario -> {
			    	String nombre = usuario.getNombre().toUpperCase();
			    	usuario.setNombre(nombre);
			    	return usuario;
			    });
		
		List<Usuario> lista2 =  nombres5.collect(Collectors.toList());
		lista2.forEach( u -> System.out.println(u.getNombre()));
		
		
		
		
		
				
		System.out.println("-----------Forma 5  Ver informacion--------------");
				
		
		
		
		
		
		Stream.of("Carro1","Carro2","Carro3")
			.peek(System.out::println)
				.map(nombre -> {
					return nombre.toUpperCase();
				}).forEach(System.out::println);
		
	}

}
