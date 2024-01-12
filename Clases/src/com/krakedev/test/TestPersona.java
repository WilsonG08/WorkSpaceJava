package com.krakedev.test;

import com.krakedev.Persona;

public class TestPersona {

	// Esto es un comentatio
	/*
	 * Comentario de varios lineas
	 * 
	 */
	public static void main(String[] args) {
		Persona p; // 1. Declaro una variable p de tipo de Persona
		// Declaro e instacion en la misma linea
		Persona p2 = new Persona();
		
		// Constructor
		Persona p4 = new Persona("Anngela", 22, 1.60);

		System.out.println("nombre: " + p4.getNombre());
		System.out.println("edad: " + p4.getEdad());
		System.out.println("estatura: " + p4.getEstatura());

		p = new Persona(); // 2. Instanciar (crear) un objeto Persona, referencias con p

		// 3. Accedo a los atributos, leo sus valores y los imprimo en la consola
		System.out.println("nombre: " + p.getNombre());
		System.out.println("edad: " + p.getEdad());
		System.out.println("estatura: " + p.getEstatura());

		// 4. Modificar los atributos
		p.setNombre("Mario");
		p.setEdad(45);
		p.setEstatura(1.56);

		System.out.println("--------------------");

		// 5. Accedo a los atributos
		System.out.println("nombre: " + p.getNombre());
		System.out.println("edad: " + p.getEdad());
		System.out.println("estatura: " + p.getEstatura());

		p2.setNombre("Anngela");

		System.out.println("*******************");
		System.out.println("p.nombre : " + p.getNombre());
		System.out.println("p2.nombre : " + p2.getNombre());

	}

}
