package mx.java.curso.lambda.service.impl;

import java.util.function.BiFunction;

import mx.java.curso.lambda.service.Aritmetica;

public class Calculadora  {
	
	public double computar(double a, double b, Aritmetica lambda) {
		
		return lambda.operacion(a, b);
	}
	
	
	public double computarConBiFunction(double a, double b, BiFunction<Double, Double, Double>  lambda) {
		
		return lambda.apply(a, b);
		
	}

}
