package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persitencia.utils.Convertidor;

// System.ou.println  ---> Solo se puede utilizar en los TEST
public class TestAdminPersona {

	public static void main(String[] args) {
		EstadoCivil ec = new EstadoCivil("U", "Union Libre");
		Persona p = new Persona("1718688286", "Alexander", "Tixi", ec);
		// Metodo estatico de convertidor
		try {
			Date fechaNac = Convertidor.convertirFecha("2020/12/23");
			Date horaNac = Convertidor.convertirHora("09:23");

			// Valores
			p.setFechaNacimiento(fechaNac);
			p.setHoraNacimiento(horaNac);
			p.setCantidadAhorrada(new BigDecimal(1230.45));
			p.setNumeroHijos(50);

			// Llamams el metot
			AdminPersonas.insertar(p);

		} catch (Exception e) {
			System.out.println("Error en el sistema: " +e.getMessage());
		}

	}

}
