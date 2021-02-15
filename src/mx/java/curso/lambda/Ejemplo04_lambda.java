package mx.java.curso.lambda;

import mx.java.curso.lambda.service.Aritmetica;
import mx.java.curso.lambda.service.impl.Calculadora;

public class Ejemplo04_lambda {
	
	public static void main(String[] args) {
		
		//Aritmetica suma = Double::sum; 
		Aritmetica suma = (a,b )-> a+b;
		
		Aritmetica resta = (a,b) -> a-b;
		
		Calculadora cal =  new Calculadora();
		
		System.out.println("Suma : "+cal.computar(3, 4, suma));
		System.out.println("Resta : "+cal.computar(10, 5, resta));
		System.out.println("Multiplicacion : "+cal.computar(4, 2, (a,b) -> a*b));
		
		
		System.out.println("Suma bifunction : "+cal.computarConBiFunction(2, 3, (a,b ) -> a + b ));
		System.out.println("Resta bifunction : "+cal.computarConBiFunction(10, 5, (a,b ) -> a - b ));

		
	}

}
