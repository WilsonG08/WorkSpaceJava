package com.krakedev.test;

import com.krakedev.Cuadrado;

public class TestCuadrado {

	public static void main(String[] args) {
		// Instanciar el objeto
		Cuadrado c1 = new Cuadrado(0);
		Cuadrado c2 = new Cuadrado(0);
		Cuadrado c3 = new Cuadrado(0);
		Cuadrado c4 = new Cuadrado(20);

		// Variables para los resultados de cada uno
		double areaCuadrado1;
		double areaCuadrado2;
		double areaCuadrado3;
		double perimetroCuadrado1;
		double perimetroCuadrado2;
		double perimetroCuadrado3;
		double areaCuadrado4;
		double perimetroCuadrado4;

		// Asignacion de los valores de cada cuadrado
		c1.setLado(6);
		c2.setLado(3);
		c3.setLado(5);

		// Para calcular el area de los 3 cuadrados
		areaCuadrado1 = c1.calcularArea();
		areaCuadrado2 = c2.calcularArea();
		areaCuadrado3 = c3.calcularArea();
		areaCuadrado4 = c4.calcularArea();

		// Para calcular el perimetro de los 3 cuadrados
		perimetroCuadrado1 = c1.calcularPerimetro();
		perimetroCuadrado2 = c2.calcularPerimetro();
		perimetroCuadrado3 = c3.calcularPerimetro();
		perimetroCuadrado4 = c4.calcularPerimetro();

		System.out.println("Area del cuadrado 1 : " + areaCuadrado1);
		System.out.println("Perimetro del cuadrado 1: " + perimetroCuadrado1);
		System.out.println("==============================================");
		System.out.println("Area del cuadrado 2 : " + areaCuadrado2);
		System.out.println("Perimetro del cuadrado 2: " + perimetroCuadrado2);
		System.out.println("==============================================");
		System.out.println("Area del cuadrado 3 : " + areaCuadrado3);
		System.out.println("Perimetro del cuadrado 3: " + perimetroCuadrado3);
		System.out.println("==============================================");
		System.out.println("Area del cuadrado 4 : " + areaCuadrado4);
		System.out.println("Perimetro del cuadrado 4: " + perimetroCuadrado4);

	}

}