package com.krakedev.estaticos.ejercicio.entidades;

import com.krakedev.estaticos.ejercicio.utils.Util;

public class Alarma {
	// Atributos
	private int dia;
	private int hora;
	private int minuto;

	// Constructor que recibe los 3 parametos
	public Alarma(int dia, int hora, int minuto) {
		super();
		this.dia = dia;
		this.hora = hora;
		this.minuto = minuto;
	}

	// GETTEER and SETTERS
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}


	@Override
	public String toString() {
		String diaFormateado = Util.formatearDia(dia);
		String horaFormateado = Util.formatearHora(hora);
		
		return diaFormateado + ", " + horaFormateado +":"+minuto;
	}

}
