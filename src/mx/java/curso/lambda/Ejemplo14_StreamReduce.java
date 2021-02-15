package mx.java.curso.lambda;

import java.util.stream.Stream;

public class Ejemplo14_StreamReduce {
	
	public static void main(String[] args) {
		
		
		System.out.println("\n---------Se implementa el distict con un reduce---------------- \n");
		
		
		
		
		String nombreNew = Stream.of("Jesus Nicolas","Roberto Nicolas","Gloria Jiemenez","Roberto Nicolas")
				.distinct()
				.reduce("resultado concatenacion", (a,b) -> a + ", "+b);
			
			System.out.println(nombreNew);
			
			
			
			
			
			
			
			
		System.out.println("-----------Stream  and reduce suma --------------");

			
			Integer suma = Stream.of(5, 10, 15, 20)
					.reduce(0, Integer::sum );
					//.reduce(0, (a, b) -> a+b );
			
			System.out.println("Suma : "+suma);	
		
		
		
	}

}
