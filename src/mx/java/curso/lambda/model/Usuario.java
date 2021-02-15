package mx.java.curso.lambda.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String nombre;
	
	private String apellido;
	
	private Integer id;
	
	private List<Factura> facturas;
	
	private static int ultimoId;

	public Usuario(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = ++ultimoId;
		this.facturas =  new ArrayList<>();
	}
	
	public Usuario(String nombre, String apellido, Integer id) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
	}
	
	public Usuario() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public List<Factura> getFacturas() {
		return facturas;
	}

	public void addFactura(Factura factura) {
		this.facturas.add(factura);
		factura.setUsuario(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	

}
