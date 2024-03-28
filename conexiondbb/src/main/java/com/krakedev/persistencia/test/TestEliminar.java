package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestEliminar {

	public static void main(String[] args) {
		try {
			AdminPersonas.eliminar("1718688286");
		} catch (Exception e) {
			System.out.println("Error del sistema: "+e.getMessage());
		}
	}

}