package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// Instanciar los objetos
		Cuadrado c1 = new Cuadrado();
		Cuadrado c2 = new Cuadrado();
		Cuadrado c3 = new Cuadrado();

		c1.lado = 4;
		c2.lado = 5;
		c3.lado = 6;

		// Variables para los resultados de cada uno
		double areaCuadrado1;
		double areaCuadrado2;
		double areaCuadrado3;
		double perimetroCuadrado1;
		double perimetroCuadrado2;
		double perimetroCuadrado3;

		// Para calcular el area de los 3 cuadrados
		areaCuadrado1 = c1.calcularArea();
		areaCuadrado2 = c2.calcularArea();
		areaCuadrado3 = c3.calcularArea();

		// Para calcular el perimetro de los 3 cuadrados
		perimetroCuadrado1 = c1.calcularPerimetro();
		perimetroCuadrado2 = c2.calcularPerimetro();
		perimetroCuadrado3 = c3.calcularPerimetro();
		
		System.out.println("Area del cuadrado 1 : " + areaCuadrado1);
		System.out.println("Perimetro del cuadrado 1: " + perimetroCuadrado1);
		System.out.println("==============================================");
		System.out.println("Area del cuadrado 2 : " + areaCuadrado2);
		System.out.println("Perimetro del cuadrado 2: " + perimetroCuadrado2);
		System.out.println("==============================================");
		System.out.println("Area del cuadrado 3 : " + areaCuadrado3);
		System.out.println("Perimetro del cuadrado 3: " + perimetroCuadrado3);
		
	}

}
