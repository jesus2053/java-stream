package mx.java.curso.lambda.model;

public class Factura {
	
	
	private String descripcion;
	
	private Usuario usuario;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Factura(String descripcion) {
		super();
		this.descripcion = descripcion;
	}
	
	

}
