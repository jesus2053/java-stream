package mx.java.curso.lambda;

import java.util.Optional;
import java.util.stream.Stream;

import mx.java.curso.lambda.model.Usuario;

public class Ejemplo10_Optional {
	
	public static void main(String[] args) {
		
		System.out.println("-----------Optional orElse--------------");

		
		Stream<Usuario> nombres = Stream
				.of("Jesus Nicolas","Jesus Jimenez","Gloria Jiemenez")
				.map( nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
				.filter( u -> u.getNombre().equals("Jesuss"));
		
		Optional<Usuario> user =  nombres.findFirst();
		
		// Manda un error si se lemanda un valor que no exiete
		//System.out.println(user.get());

		
		System.out.println(user.orElse(new Usuario("Noexiste","Noexite")).getNombre());
		
		
		
		
		
		System.out.println("-----------Optional orElseGet supplier--------------");

		
		Stream<Usuario> nombres2 = Stream
				.of("Jesus Nicolas","Jesus Jimenez","Gloria Jiemenez")
				.map( nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
				.filter( u -> u.getNombre().equals("Jesuss"));
		
		Optional<Usuario> user2 =  nombres2.findFirst();
		
		System.out.println(user2.orElseGet(()-> new Usuario("No exite", "no exite")).getNombre());
		
		
		
		
		System.out.println("-----------Optional isPresent--------------");
		
		
		
		Stream<Usuario> nombres3 = Stream
				.of("Jesus Nicolas","Jesus Jimenez","Gloria Jiemenez")
				.map( nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
				.filter( u -> u.getNombre().equals("Jesuss"));
		
		Optional<Usuario> user3 =  nombres3.findFirst();
		
		
		if(user3.isPresent()) {
			System.out.println(user3.get().getNombre());
		}else {
			System.out.println("No esta presente");
		}
		

		

		
		
		
	}

}
