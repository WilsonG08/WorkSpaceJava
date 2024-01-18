package com.krakedev.estaticos;

public class Utilitarios {
	// Metodo para valdiar numero dento del rango
	// Para que sea estatico se coloca STATIC
	public static boolean valdiarRango(int valor) {
		if (valor >= 0 && valor <= 10) {
			return true;
		} else
			return false;
	}

}
