package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {

		// Creacion de las 3 Variables
		Producto productoA = new Producto();
		Producto productoB= new Producto();
		Producto productoC= new Producto();

		// Modificacion de los valores Producto A
		productoA.nombre = "Tempra";
		productoA.descripcion = "Pastilla";
		productoA.precio = 0.35;
		productoA.stockActual = 20;

		
		// Modificacion de los valores Producto A
		productoB.nombre = "Inyeccion";
		productoB.descripcion = "Pinchar";
		productoB.precio = 0.10;
		productoB.stockActual = 50;

		
		// Modificacion de los valores Producto A
		productoC.nombre = "Preservativos";
		productoC.descripcion = "Hombre";
		productoC.precio = 1.00;
		productoC.stockActual = 45;
		
		System.out.println("PRODUCTO A ");
		System.out.println("Nombre : " + productoA.nombre);
		System.out.println("Descripcion : " + productoA.descripcion);
		System.out.println("Precio : " + productoA.precio);
		System.out.println("Stock : " + productoA.stockActual + "\n");
		
		
		System.out.println("PRODUCTO B");
		System.out.println("Nombre : " + productoB.nombre);
		System.out.println("Descripcion : " + productoB.descripcion);
		System.out.println("Precio : " + productoB.precio);
		System.out.println("Stock : " + productoB.stockActual + "\n");
		
		System.out.println("PRODUCTO C");
		System.out.println("Nombre : " + productoC.nombre);
		System.out.println("Descripcion : " + productoC.descripcion);
		System.out.println("Precio : " + productoC.precio);
		System.out.println("Stock : " + productoC.stockActual);

		
	}

}
