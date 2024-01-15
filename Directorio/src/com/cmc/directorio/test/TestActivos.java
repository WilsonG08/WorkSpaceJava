
package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {
	public static void main(String[] args) {
		// Instanciar el objeto
		Telefono tel = new Telefono("movi", "0987654321", 593);
		Contacto con = new Contacto("Daya", "Muzo", tel, 12.5);
		AdminContactos admin = new AdminContactos();

		System.out.println("Antes");
		System.out.println("El contacto:" + con.getNombre() + " apellido:" + con.getApellido() + " telefono:"
				+ con.getTelefono().getNumero() + " tiene Whatsapp: " + con.getTelefono().isTieneWhatsapp());
		System.out.println("");

		// Activacion
		admin.activarUsuario(con);

		// Activado
		System.out.println("Después");
		System.out.println("El contacto:" + con.getNombre() + " apellido:" + con.getApellido() + " telefono:"
				+ con.getTelefono().getNumero() + " tiene Whatsapp: " + con.getTelefono().isTieneWhatsapp());
		System.out.println("El contacto está activo: " + con.isActivo());
	}
}