package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class TestCelda {
	public static void main(String[] args) {
		
		/*
		 *  Lo que se realizo para que funcione y muestre el resultado esperado fue:
		 *  Cambiar el orden de las operaciones, por eso se elimino la linea de:
		 *  System.out.println(celda.getProducto().getNombre());
		 *   Porque se trataba de acceder a algo que no estaba inicializado
		*/
		
		Celda celda = new Celda("A1");
		
		// Instanciamos un objeto para los datos
		// Aqui se creo el producto 
		Producto producto = new Producto("KE34", "Papitas", 0.85);
		
		// Ingresar el producto en la celda con un stock inicial de 5
		celda.ingresarProducto(producto, 5);

		// Se cambio el orden de un mensaje, en especial de los **** para que muestre el resultado esperado
		System.out.println("CELDA:" + celda.getCodigo());
		System.out.println("*************************************");
		System.out.println("Nombre Producto:" + celda.getProducto().getNombre());
		System.out.println("Precio Producto:" + celda.getProducto().getPrecio());
		System.out.println("Código Producto:" + celda.getProducto().getCodigo());
		System.out.println("STOCK:" + celda.getStock());
		
	}
}