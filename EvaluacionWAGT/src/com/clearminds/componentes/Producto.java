package com.clearminds.componentes;

public class Producto {
	// Metodos
	private String nombre;
	private double precio;
	private String codigo;

	// Constructor con 3 parametros
	public Producto(String codigo, String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
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
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	// Metodo incrementar Precio
	public void incrementarPrecio(int porcentajeIncremento) {
		double incremento;
		incremento = (porcentajeIncremento / 100.0) * precio;
		precio += incremento;
	}

	// Metodo disminuir Precio
	public void disminuirPrecio(double valorDescuento) {
		precio -= valorDescuento;
	}

}