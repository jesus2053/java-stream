package mx.java.curso.lambda;

import java.util.stream.Stream;

import mx.java.curso.lambda.model.Usuario;

/**
 * @author JNicolas
 *
 */
public class Ejemplo12_StreamDistinct {
	
	public static void main(String[] args) {
		
		System.out.println("\n---------Se implementa el distict basico ---------------- \n");
		
		
		
		
		
		Stream.of("Jesus Nicolas","Roberto Nicolas","Gloria Jiemenez","Roberto Nicolas","Roberto Nicolas")
			.distinct()
			.forEach(System.out::println);

		
				
		
		System.out.println("\n---------Se implementa el distict (cuando es String) antes de crear el objeto ---------------- \n");
		
		
		
		
		Stream<Usuario> nombres1 = Stream.of("Jesus Nicolas","Hayden Cosme","Ely Cosme","Gloria Jimenez","Hayden Cosme")
				.distinct()
				.map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]));
		
		nombres1.forEach(System.out::println);
		
		
		
		
		
		System.out.println("\n---------Se implementa el distict despues de crear el objeto(Cuando es de tipo Usuario) funciona correctamente porque se utiliza hashCode y equals en la clase usuario----------------\n");
		


		
		Stream<Usuario> nombres2 = Stream.of("Jesus Nicolas","Hayden Cosme","Ely Cosme","Gloria Jimenez","Hayden Cosme")
				.map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
				.distinct();
		
		nombres2.forEach(System.out::println);
		
		
		System.out.println("\n ------- \n");
		
		
		
		
	}

}
