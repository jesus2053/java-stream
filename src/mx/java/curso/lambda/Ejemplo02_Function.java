package mx.java.curso.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Que es una expresición lambda: es implementar un método sin necesidad de implementar una clase, también conocido
 * como función o método de flecha, que viene  a través de una interfaz. Al final una expresión lambda se 
 * traduce a una interfaz funcional con un solo método abstracto, no requiere tener una clase para poder implementar este
 * método 
 * 
 * Function : Represents a function that accepts one argument and produces a result.
 * 
 * 
 * @author JNicolas
 *
 */

public class Ejemplo02_Function {
	
	public static void main(String[] args) {
		
		Function<String, String> function1 =  param -> "Hola que tal "+param;
		
		Function<String, String> function2 =  param -> { 
			return "Hola que tal "+param;
		};
		
		System.out.println(function1.apply("Jesus"));
		
		
		Function<String, String> function3 = param -> param.toUpperCase();
		Function<String, String> function4 = String::toUpperCase;

		
		System.out.println(function3.apply("jesus"));
		
		
		
		BiFunction<String, Integer, String> function5 = (a,b) -> {
			return  a+" tiene "+b +" años";
		};
		BiFunction<String, Integer, String> function6 = (a,b) -> a.toUpperCase().concat(" tiene").concat(""+b+" años");
		
		
		System.out.println(function5.apply("Jesus", 33));
		System.out.println(function5.apply("Hayden", 38));
		
		//BiFunction<String, String, Integer> function7 = (a,b)-> a.compareTo(b);
		
		// Lo que recibe A se le invoca en el método compareTo y se pasa B por argumento 
		BiFunction<String, String, Integer> function8 = String::compareTo;
		System.out.println(function8.apply("jesus", "jesus"));
		
		BiFunction<String, String, String> function9 = String::concat;
		System.out.println(function9.apply("jesus", " nicolas"));

		
	}

}
