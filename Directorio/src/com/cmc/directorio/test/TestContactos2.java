package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		// Instanciar el objeto
		Telefono tel1 = new Telefono("movi", "0987654321", 593);
		Telefono tel2 = new Telefono("movi", "346432423", 593);
		Contacto ct1 = new Contacto("Ana", "Gomez", tel1, 600);
		Contacto ct2 = new Contacto("Carlos", "Perez", tel2, 90);
		tel1.setTieneWhatsapp(true);
		ct1.setActivo(true);
		AdminContactos admi = new AdminContactos();

		Contacto contactoMasPesado = admi.buscarMasPesado(ct1, ct2);

		if (contactoMasPesado != null) {
			System.out.println("Nombre: " + contactoMasPesado.getNombre() + " Apellido: "
					+ contactoMasPesado.getApellido() + " Activo: " + contactoMasPesado.isActivo() + " teléfono: "
					+ contactoMasPesado.getTelefono().getNumero() + " Operadora: "
					+ contactoMasPesado.getTelefono().getOperadora() + " Peso: " + contactoMasPesado.getPeso() + " kg");
		} else {
			System.out.println("No hay contacto pesado");
		}

		boolean comprarOperadoras = admi.buscarOperadoras(ct1, ct2);

		System.out.println("Operadora de " + ct1.getNombre() + " es:" + ct1.getTelefono().getOperadora());
		System.out.println("Operadora de " + ct2.getNombre() + " es:" + ct2.getTelefono().getOperadora());
		System.out.println("¿Tienen la misma operadora?: " + comprarOperadoras);
	}

}