package mx.java.curso.lambda;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Ejemplo08_StreamFilter2 {
	
	public static void main(String[] args) {
		
		System.out.println("-----------Filter and count --------------");

		
		long cantidad = Stream
				.of("Jesus Nicolas","Jesus Jimenez","","Gloria Jiemenez","")
				.filter(String::isEmpty)
				.peek(System.out::println)
				.count();
		
		
		System.out.println(cantidad);
		
		
		
		
		
		System.out.println("-----------Stream and distint --------------");
		// Distinc no muestra valores repetidos
		
		
		
		Stream.of("Jesus Nicolas","Roberto Nicolas","Gloria Jiemenez","Roberto Nicolas")
				.distinct()
				.forEach(System.out::println);
		
		
		System.out.println("-----------Stream and distint and reduce --------------");
		
		
		String nombre = Stream.of("Jesus Nicolas","Roberto Nicolas","Gloria Jiemenez","Roberto Nicolas")
			.distinct()
			.reduce("resultado concatenacion", (a,b) -> a + ", "+b);
		
		System.out.println(nombre);

		System.out.println("-----------Stream  and reduce suma --------------");

		
		Integer suma = Stream.of(5, 10, 15, 20)
				.reduce(0, Integer::sum );
				//.reduce(0, (a, b) -> a+b );
		
		System.out.println("Suma : "+suma);
		
		
		System.out.println("-----------Flujo de enteros --------------");
		IntStream numerosEnteros =  IntStream.range(5, 10).peek(System.out::println);
		
		int resultado  =  numerosEnteros.reduce(0, Integer::sum);
		System.out.println("IntStream sum : "+resultado);
		
		Integer resultadoInStream = IntStream.range(5, 10).peek(System.out::println).reduce(0, Integer::sum);
		System.out.println("IntStream sum reducido : "+resultadoInStream);

		Integer resultadoInStream2 = IntStream.range(5, 10).peek(System.out::println).sum();
		System.out.println("IntStream sum reducido2 : "+resultadoInStream2);
		
		
		System.out.println("----------- IntSummaryStatistics  --------------");

		IntStream numeros =  IntStream.range(5, 10).peek(System.out::println);
		IntSummaryStatistics stats =  numeros.summaryStatistics();
		System.out.println("max: " + stats.getMax());
		System.out.println("min:  " + stats.getMin());
		System.out.println("sum:  " + stats.getSum());
		System.out.println("promedio: " + stats.getAverage());
		System.out.println("total: " + stats.getCount());

		

		
		

		
		
	}

}
