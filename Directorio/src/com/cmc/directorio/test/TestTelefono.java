package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {

	public static void main(String[] args) {
		// Instanciar el objeto
		Telefono tel = new Telefono("Movi", "0994234123", 10);

		// Imprimiendo en consola
		System.out.println("Operadora: " + tel.getOperadora() + " Numero: " + tel.getNumero() + " Codigo: "
				+ tel.getCodigo() + " Tiene Whatsapp: " + tel.isTieneWhatsapp());

	}

}