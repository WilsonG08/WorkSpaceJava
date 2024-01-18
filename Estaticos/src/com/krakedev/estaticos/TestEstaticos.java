package com.krakedev.estaticos;

public class TestEstaticos {

	public static void main(String[] args) {

		// Para invocar un metodo estatico, s elo hace directamente
		// desde la clase, No hace falta instanciar un objeto
		double numero = Math.random();
		System.out.println(numero);

		int radio = 10;
		double area = Math.PI * radio;
		System.out.println("Area es: " + area);

	}

}
