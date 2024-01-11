package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {

		// Intanciando de la clase
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();

		// Modificacion de los valores de auto 1 y auto 2
		auto1.marca = "Mazda";
		auto1.anio = 2019;
		auto1.precio = 24.000;

		// Auto 2
		auto2.marca = "Chevrolet";
		auto2.anio = 2024;
		auto2.precio = 10.000;

		// Imprimir los datos del auto 1
		System.out.println("Auto 1 - Marca: " + auto1.marca);
		System.out.println("Auto 1 - Año: " + auto1.anio);
		System.out.println("Auto 1 - precio: " + auto1.precio);
		
		System.out.println("\n");

		// Imprimir los datos del auto 2
		System.out.println("Auto 2 - Marca: " + auto2.marca);
		System.out.println("Auto 2 - Año: " + auto2.anio);
		System.out.println("Auto 2 - precio: " + auto2.precio);

	}

}
