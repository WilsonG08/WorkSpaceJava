package com.krakedev.herencia;

public class TestPersona {

	public static void main(String[] args) {
		// Instancia
		Persona p = new Persona("123456789", "Wilson");

		// Devuelve el numero de strign
		System.out.println(p.toString());
		
		System.out.println(p);// p.toString

	}

}
