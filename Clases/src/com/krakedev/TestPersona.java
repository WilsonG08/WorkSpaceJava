package com.krakedev;

/*
 * 
 * Comentario de varias lineas
 * */

public class TestPersona {

	public static void main(String[] args) {
		// 1.- Creo una variable de tipo Persona
		Persona p;	
		Persona p2 = new Persona();
		
		// 2.- Instanciar o crear ub objeto Persona y se lo referencia a p
		p = new Persona();
		
		// 3.- Accedo a los atributos
		System.out.println("Nombre: " + p.nombre);
		System.out.println("Edad: " + p.edad);
		System.out.println("Estatura: " + p.estatura);
		
		// 4.- Modificar los atributos
		p.nombre = "Mario";
		p.edad = 45;
		p.estatura = 1.56;
		
		System.out.println("---------------------------");
		// 5.- Accedo a los atributos
		System.out.println("Nombre: " + p.nombre);
		System.out.println("Edad: " + p.edad);
		System.out.println("Estatura: " + p.estatura);
		
		p2.nombre = "Angelina";
		
		
		System.out.println("***********");
		System.out.println("p.nombre: " + p.nombre);
		System.out.println("p2.nombre: " + p2.nombre);
		
		
		

	}

}
