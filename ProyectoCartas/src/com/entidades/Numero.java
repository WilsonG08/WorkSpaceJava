package com.entidades;

public class Numero {
	// Atributos
	private String numeroCarta;
	private int valor;

	// Constructor con ambos parametros
	public Numero(String numeroCarta, int valor) {
		this.numeroCarta = numeroCarta;
		this.valor = valor;
	}

	public String getNumeroCarta() {
		return numeroCarta;
	}

	public void setNumeroCarta(String numeroCarta) {
		this.numeroCarta = numeroCarta;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	// Metodo para mostrar
	public void mostrarInformacion() {
		System.out.println(numeroCarta + "-" + valor);
	}

}
