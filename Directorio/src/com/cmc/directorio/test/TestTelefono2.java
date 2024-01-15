package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono2 {

	public static void main(String[] args) {
		// Referenciar
		Telefono telf = new Telefono("movi", "098234234", 20);

		// Crear un objeto
		AdminTelefono at = new AdminTelefono();

		// Invocacion del metodo activarMensajeria
		at.activarMensajeria(telf);

		// Impresion
		// Imprimiendo en consola
		System.out.println("Operadora: " + telf.getOperadora() + " Numero: " + telf.getNumero() + " Codigo: "
				+ telf.getCodigo() + " Tiene Whatsapp: " + telf.isTieneWhatsapp());

	}

}