package com.grupoi.poo.objetos;


public class Producto {
	private float precio;
	private String nombre;
	private String descripcion;
	
	public float getValorTotal(int cantidadProducto) {
		return precio*cantidadProducto;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
