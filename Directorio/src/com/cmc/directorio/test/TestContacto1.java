package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		// Instanciar el objeto
		Telefono tel = new Telefono("movi", "0984836229", 10);
		Contacto c = new Contacto("Wilson", "Guayanya", tel, 500);

		// Imprimir en consola la información del contacto
		System.out.println("Nombre: " + c.getNombre() + " Apellido: " + c.getApellido() + " Activo: " + c.isActivo()
				+ " telefono: " + c.getTelefono().getNumero() + " Operadora: " + c.getTelefono().getOperadora()
				+ " Peso: " + c.getPeso());

	}

}