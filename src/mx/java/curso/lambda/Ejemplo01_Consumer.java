package mx.java.curso.lambda;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import mx.java.curso.lambda.model.Usuario;


/**
 * Consummer : Representa una operación que acepta un único argumento de entrada y no devuelve ningún resultado, es una expresión
 * lambda, de tipo generico
 * BiConsummer: Represents an operation that accepts two input arguments and returns no result. This is the two-arity specialization
 * of Consumer.
 * 
 * @author JNicolas
 *
 */
public class Ejemplo01_Consumer {
	
	public static void main(String[] args) {
		
		Consumer<String> consumidor = saludo -> System.out.println(saludo);
		
		consumidor.accept("Consummer: Hola mundo");
		
		
		Consumer<Date> consumidor2 = fecha -> {
			SimpleDateFormat f =  new SimpleDateFormat("yyyy-MM-dd");
			System.out.println("Consummer: "+f.format(fecha));
		};

		consumidor2.accept(new Date());
		
		BiConsumer<String, Integer> consumidorBi = (nombre,edad)-> System.out.println("BiConsummer: "+nombre+" tiene "+edad+" años"); 
		
		consumidorBi.accept("Jesus", 33);
		
		Consumer<String> consumidor3 = mensaje -> System.out.println(mensaje);
		Consumer<String> consumidor4 = System.out::println;
		
		consumidor3.accept("Forma reducida lambda 1");
		consumidor4.accept("Forma reducida lamda 2");
		
		
		List<String> nombres = Arrays.asList("Jesus","Nicolas","Belem", "Gloria","Roberto");
		nombres.forEach(consumidor4);
		
		//Supplier<Usuario> crearUsuario = () -> new Usuario();
		Supplier<Usuario> crearUsuario = Usuario::new;
		
		Usuario usuario1 = crearUsuario.get();
		Usuario usuario2 = crearUsuario.get();
		
		BiConsumer<Usuario, String> asignarNombre = ( persona, nombre) -> {
			persona.setNombre(nombre);
		};
		
		BiConsumer<Usuario, String> asignarNombre2 = Usuario::setNombre;

		asignarNombre.accept(usuario1,"Jesus Nicolas");
		asignarNombre2.accept(usuario2,"Gloria Jimenez");
		
		System.out.println("Nombre del usuario forma1: "+usuario1.getNombre());
		System.out.println("Nombre del usuario forma2: "+usuario2.getNombre());
		
		
		Supplier<String> provedor = () -> {
			return "Hola mundo lambda supplier";
		};
		
		Supplier<String> provedor2 = () -> "Hola mundo lambda supplier";
		
		
		System.out.println(provedor.get());
		
		
		
	}

}
