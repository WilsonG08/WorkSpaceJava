package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		int areaR1;
		int areaR2;
		double perimetro; 
		
		// Instancia del objeto
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		Rectangulo r3 = new Rectangulo();
		
		r1.base = 10;
		r1.altura = 5;
		
		r2.base = 8;
		r2.altura = 3;
		
		r3.altura = 4;
		r3.base = 6;
		
		areaR1 = r1.calcularArea();
		areaR2 = r2.calcularArea();
		perimetro = r3.calcularArea();
		
		
		System.out.println("Area de r1: " + areaR1);
		System.out.println("Area de r2: " + areaR2);
		System.out.println("El perimetro es: " + perimetro);

	}

}
