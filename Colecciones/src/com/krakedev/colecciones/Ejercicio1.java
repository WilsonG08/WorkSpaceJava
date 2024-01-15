package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {
		String valorRecuperado;
		
		// Array Lisy
		ArrayList<String> cadenas;
		
		// Instanciar el objeto
		cadenas = new ArrayList<String>();
		
		// Imprimir el tamaño del arreglo
		System.out.println("Tamaño: " + cadenas.size());
		
		// Agregar cosas al array
		cadenas.add("uno"); // posicion 0
		cadenas.add("dos"); // posicion 1
		
		System.out.println("Tamaño dos: " + cadenas.size());
		
		// recuperar los datos
		valorRecuperado = cadenas.get(1);
		System.out.println("V.R: " +valorRecuperado);
		
		String cadena;
		for(int i = 0 ; i < cadenas.size(); i++) {
			cadena = cadenas.get(i);
			System.out.println("Cadena: " + cadena);
		}
		

	}

}
