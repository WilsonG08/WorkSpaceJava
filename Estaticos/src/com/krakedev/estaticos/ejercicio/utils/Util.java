package com.krakedev.estaticos.ejercicio.utils;

public class Util {

	public static String formatearHora(int numero) {
		if (numero < 10) {
			return "0" + numero;
		} else {
			return Integer.toString(numero);
		}
	}
	
	public static String formatearDia(int numero) {
        String[] diasDeLaSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        if (numero >= 0 && numero < diasDeLaSemana.length) {
            return diasDeLaSemana[numero];
        } else {
            return "Día no válido";
        }
    }

}
