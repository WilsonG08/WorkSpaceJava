package com.krakedev;

/*
 * 
 * Comentario de varias lineas
 * */

public class TestPersona {

	public static void main(String[] args) {
		// 1.- Creo una variable de tipo Persona
		Persona p;	
		
		// 2.- Instanciar o crear ub objeto Persona y se lo referencia a p
		p = new Persona();
		
		// 3.- Accedo a los atributos
		System.out.println("Nombre: " + p.nombre);
		System.out.println("Edad: " + p.edad);
		System.out.println("Estatura: " + p.estatura);
		

	}

}
