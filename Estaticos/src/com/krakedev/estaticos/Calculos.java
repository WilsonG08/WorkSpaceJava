package com.krakedev.estaticos;

public class Calculos {
	// Asi se crea una constante --> FINAL
	// FINAL hace que el valor no se pueda cmabiar, es decir convierte la variabel en constante
	private final double IVA = 12;

	public double calcularIva(double monto) {
		return monto * IVA / 100;
	}

}
