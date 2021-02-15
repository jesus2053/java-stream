package mx.java.curso.lambda;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import mx.java.curso.lambda.model.Usuario;

public class Ejemplo13_StreamMapToInt {
	
	public static void main(String[] args) {
		
		IntStream lengthNombres = Stream
				.of("Jesus Nicolas","Hayden Cosme","Gloria Jiemenez","Karen Higuera")
				.map( nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
				.distinct()
				.mapToInt( u -> u.toString().length())
				.peek(System.out::println);
		
		IntSummaryStatistics stats = lengthNombres.summaryStatistics();
		
		System.out.println("max : "+stats.getMax());
		System.out.println("min : "+stats.getMin());
		System.out.println("Total letras : "+stats.getSum());
		System.out.println("Promedio : "+stats.getAverage());
		System.out.println("Total nombres : "+stats.getCount());
		
		
	}

}
