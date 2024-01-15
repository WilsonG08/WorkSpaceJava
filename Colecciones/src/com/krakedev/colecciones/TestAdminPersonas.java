package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		// Instanciar
		AdminPersonas admin = new AdminPersonas();

		admin.agregar(new Persona("Mario", "Benedetti", 50));
		admin.agregar(new Persona("Clark", "Kennet", 30));
		admin.agregar(new Persona("Bruno", "Diaz", 25));
		admin.imprimir();

		Persona p1 = admin.buscarPorNombre("Mario");
		if (p1 != null) {
			System.out.println("Encontrado: " + p1.getApellido() + " " + p1.getEdad());
		} else {
			System.out.println("No existe la persona con el nombre: Jose");
		}

		// Para la lista de mayores
		ArrayList<Persona> personasMayores = admin.buscarMayores(30);
		System.out.println("Persona mayores: " + personasMayores.size());
	
	}
	

}
