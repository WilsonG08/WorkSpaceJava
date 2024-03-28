package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestConsultaPersonas {

	public static void main(String[] args) {
		try {
			ArrayList<Persona> personas = AdminPersonas.buscarPorNombre("Elsa");
			System.out.println(personas);
			
			
		} catch (Exception e) {
			// Mostramos el error
			System.out.println(e.getMessage());
		}

	}

}
