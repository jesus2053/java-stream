package mx.java.curso.lambda;

public class Prueba {
	
	public static void main(String[] args) {
		
		String cadena =  "UploadResponseSBX(itemsRegistrados=176, gruposRegistrados=0, modificadoresRegistrados=0, categoriasRegistrados=0, infoNutrimentalRegistrados=0, recetaRegistrados=0, cuponesRegistrados=0, cuponesItemRegistrados=0, vigenciaRegistrados=0, subgruposRegistrados=0)";
		
		String html ="";
		String []list = cadena.split("[( \\) ,]");
		
		for(int a = 1;  a<list.length; a++) {
			html="";
			
			
			System.out.println(list[a]);
		}
		
		String a =  html.replace("=",":");
		
		System.out.println();
		
		
	}

}
