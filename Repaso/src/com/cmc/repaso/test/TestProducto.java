package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// Instancia del objeto
		Producto producto1 = new Producto("Producto 1", 500);
		Producto producto2 = new Producto("Queso", 0);
		Producto producto3 = new Producto("Arroz", 0);

		producto2.setPrecio(200);
		producto3.setPrecio(-100);

		// Prueba del descuento
		double precioDescuento = producto2.CalcularPrecioPromo(20);

		System.out.println("Producto 1, nombre " + producto1.getNombre() + ", Precio: " + producto1.getPrecio());
		System.out.println("Producto 2, nombre " + producto2.getNombre() + ", Precio: " + producto2.getPrecio());
		System.out.println("Producto 3, nombre " + producto3.getNombre() + ", Precio: " + producto3.getPrecio());
		System.out.println("Descuento del " + producto3.getNombre() + " descuento: " + precioDescuento);

	}

}