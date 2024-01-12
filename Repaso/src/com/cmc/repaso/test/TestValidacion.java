package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		// Instancia del objeto
		Validacion validacion = new Validacion();

		boolean resultado1 = validacion.validarMonto(100);
		System.out.println("Resultado 1: " + resultado1);

		boolean resultado2 = validacion.validarMonto(-1);
		System.out.println("Resultado 2: " + resultado2);

		boolean resultado3 = validacion.validarMonto(0);
		System.out.println("Resultado 3: " + resultado3);

	}

}