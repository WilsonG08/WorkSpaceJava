package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// Creacion de las 3 Variables
		Producto productoA;
		Producto productoB;
		Producto productoC;

		// Instancia de los tres objetos
		productoA = new Producto();
		productoB = new Producto();
		productoC = new Producto();

		// Modificacion de los atributos del producto 1
		productoA.setNombre("Presevativos DUO");
		productoA.setDescripcion("Es un prodcuto para caballeros");
		productoA.setPrecio(2.50);
		productoA.setStockActual(50);

		// Modificacion de los atributos del producto 2
		productoB.setNombre("Paracetamol");
		productoB.setDescripcion("Aliviar dolor y bajar la fiebre");
		productoB.setPrecio(1.50);
		productoB.setStockActual(25);

		// Modificacion de los atributos del producto 3
		productoC.setNombre("Cepillo de dientes");
		productoC.setDescripcion("Es para cepillarse los dientes");
		productoC.setPrecio(1.00);
		productoC.setStockActual(10);

		// Mostrar los valores del producto 1
		System.out.println("Nombre del producto 1: " + productoA.getNombre());
		System.out.println("Descripcion del producto 1: " + productoA.getDescripcion());
		System.out.println("Precio del producto 1: " + productoA.getPrecio());
		System.out.println("Stock actual del producto 1: " + productoA.getStockActual());

		System.out.println("==================================");

		// Mostrar los valores del producto 2
		System.out.println("Nombre del producto 2: " + productoB.getNombre());
		System.out.println("Descripcion del producto 2: " + productoB.getDescripcion());
		System.out.println("Precio del producto 2: " + productoB.getPrecio());
		System.out.println("Stock actual del producto 2: " + productoB.getStockActual());
		System.out.println("==================================");

		// Mostrar los valores del producto 3
		System.out.println("Nombre del producto 3: " + productoC.getNombre());
		System.out.println("Descripcion del producto 3: " + productoC.getDescripcion());
		System.out.println("Precio del producto 3: " + productoC.getPrecio());
		System.out.println("Stock actual del producto 3: " + productoC.getStockActual());

	}

}