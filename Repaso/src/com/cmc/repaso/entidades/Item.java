package com.cmc.repaso.entidades;

public class Item {
	// Atributos
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;

	// Metodos
	public void imprimir() {
		System.out.println("Producto: " + nombre);
		System.out.println("Producto Actuales: " + productosActuales);
		System.out.println("Productos Devueltos: " + productosDevueltos);
		System.out.println("Productos Vendido: " + productosVendidos);
		System.out.println("");
	}

	public void vender(int cantidadProductosVendidos) {
		productosActuales -= cantidadProductosVendidos;
		productosVendidos += cantidadProductosVendidos;
	}

	public void devolver(int cantidadProductosVendidos) {
		productosDevueltos += cantidadProductosVendidos;
		productosActuales += cantidadProductosVendidos;
		if (productosVendidos > 0) {
			productosVendidos -= cantidadProductosVendidos;
		} else {
			productosVendidos -= 0;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getProductosActuales() {
		return productosActuales;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}

	public int getProductosDevueltos() {
		return productosDevueltos;
	}

	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}

	public int getProductosVendidos() {
		return productosVendidos;
	}

	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}

}