package com.cmc.directorio.entidades;

public class AdminTelefono {

	// Metodos
	public void activarMensajeria(Telefono tlf) {
		if (tlf.getOperadora().equals("movi")) {
			tlf.setTieneWhatsapp(true);
		}
	}

	// Metodo contar Movi
	public int contarMovi(Telefono tlf1, Telefono tlf2, Telefono tlf3) {
		int contadorMovi = 0;

		if (tlf1.getOperadora() == "movi") {
			contadorMovi++;
		}
		if (tlf2.getOperadora() == "movi") {
			contadorMovi++;
		}
		if (tlf3.getOperadora() == "movi") {
			contadorMovi++;
		}
		return contadorMovi;
	}

	// Metodo contar Claro
	public int contarClaro(Telefono tlf1, Telefono tlf2, Telefono tlf3, Telefono tlf4) {
		int contadorClaro = 0;

		if (tlf1.getOperadora() == "claro") {
			contadorClaro++;
		}
		if (tlf2.getOperadora() == "claro") {
			contadorClaro++;
		}
		if (tlf3.getOperadora() == "claro") {
			contadorClaro++;
		}
		if (tlf4.getOperadora() == "claro") {
			contadorClaro++;
		}
		return contadorClaro;
	}
}