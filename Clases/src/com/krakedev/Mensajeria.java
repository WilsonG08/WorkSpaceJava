package com.krakedev;

public class Mensajeria {

	// Funcion que no retorna nada
	public void saludar() {
		System.out.println("Hola HUMANOS");
	}
	
	// No retorna pero recibe parametros 
	public void saludarAmigos(String nombre, String apellido) {
		System.out.println("Hola " + nombre + " " + apellido);
	}

}
