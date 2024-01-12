package com.cmc.repaso.entidades;

public class Producto {
	// Atributos
	private String nombre;
	private double precio;

	// Constructor
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	// Metodos
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio > 0) {
		} else {
			precio = precio * -1;
		}
		this.precio = precio;
	}

	public double CalcularPrecioPromo(double descuento) {
		return precio * (1 - descuento / 100);
	}
}