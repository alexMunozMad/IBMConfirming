package dto;

import java.util.Date;

public class Proveedor {

	
	private int idProveedor;
	
	private String nombre;
	
	private Date fechaAlta;
	
	private int idCliente;
	

	
	public Proveedor() {
		super();
	}

	public Proveedor(int idProveedor, String nombre, Date fechaAlta, int idCliente) {
		super();
		this.idProveedor = idProveedor;
		this.nombre = nombre;
		this.fechaAlta = fechaAlta;
		this.idCliente = idCliente;
	}

	public int getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	
	
	
}
