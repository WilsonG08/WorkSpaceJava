package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		// Instanciar el objero
		Telefono tl1 = new Telefono("movi", "0987654329", 10);
		Telefono tl2 = new Telefono("claro", "0987654329", 10);
		Telefono tl3 = new Telefono("movi", "0987654329", 10);

		// Invocacion del metodo contar
		AdminTelefono admin = new AdminTelefono();
		int contadorMovi = 0;
		contadorMovi = admin.contarMovi(tl1, tl2, tl3);

		System.out.println("Canitdad de telefonos con operadora movi: " + contadorMovi);

	}

}