package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		// Instancia del objeto
		Estudiante estudiante1 = new Estudiante("");
		Estudiante estudiante2 = new Estudiante("");
		Estudiante estudiante3 = new Estudiante("");

		estudiante1.setNombre("Pedro");
		estudiante2.setNombre("Jose");
		estudiante3.setNombre("Maria");

		estudiante1.calificar(8);
		estudiante2.calificar(5);
		estudiante3.calificar(10);

		System.out.println(
				"Nombre del estudiante: " + estudiante1.getNombre() + " Resultado: " + estudiante1.getResultado());
		System.out.println("***********************************************");
		System.out.println(
				"Nombre del estudiante: " + estudiante2.getNombre() + " Resultado: " + estudiante2.getResultado());
		System.out.println("-----------------------------------------------");
		System.out.println(
				"Nombre del estudiante: " + estudiante3.getNombre() + " Resultado: " + estudiante3.getResultado());

	}

}