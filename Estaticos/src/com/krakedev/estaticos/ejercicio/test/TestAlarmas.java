package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.DiasSemanas;

public class TestAlarmas {

	public static void main(String[] args) {
		// instanciando varias alarmas
		Alarma al1 = new Alarma(DiasSemanas.LUNES, 6, 50);
		Alarma al2 = new Alarma(DiasSemanas.MARTES, 23, 45);
		Alarma al3 = new Alarma(DiasSemanas.MIERCOLES, 13, 34);
		Alarma al4 = new Alarma(DiasSemanas.JUEVES, 16, 10);

		// Agregando alarmas a la lista de alarmas
		AdminAlarmas agregar = new AdminAlarmas();
		agregar.agregarAlarma(al1);
		agregar.agregarAlarma(al2);
		agregar.agregarAlarma(al3);
		agregar.agregarAlarma(al4);

		// Recuperamos la lista de alarmas de AdminAlarmas e imprimir la informacion
		ArrayList<Alarma> alarmasActuales = agregar.getAlarmas();
		System.out.println(alarmasActuales);
	}

}
