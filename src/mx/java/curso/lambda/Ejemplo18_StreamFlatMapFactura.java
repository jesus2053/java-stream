package mx.java.curso.lambda;

import java.util.Arrays;
import java.util.List;

import mx.java.curso.lambda.model.Factura;
import mx.java.curso.lambda.model.Usuario;

public class Ejemplo18_StreamFlatMapFactura {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario("Jesus", "Nicolas");
		Usuario u2 = new Usuario("Hayden", "Cosme");
		
		u1.addFactura(new Factura("compras de comida"));
		u1.addFactura(new Factura("compras de viaje"));
		
		u2.addFactura(new Factura("compras de medicamentos"));
		u2.addFactura(new Factura("compras de tecnologia"));
		
		List<Usuario> usuarios =  Arrays.asList(u1,u2);
		
		usuarios.stream()
			.flatMap( u -> u.getFacturas().stream())
			.forEach( f -> System.out.println(f.getDescripcion()
					.concat(" : ")
					.concat(f.getUsuario().getNombre())));
		
		
		
		
//		for(Usuario a :usuarios) {
//			for(Factura f : a.getFacturas()) {
//				System.out.println(f.getDescripcion());
//			}
//			
//		}
		
		
	}

}
