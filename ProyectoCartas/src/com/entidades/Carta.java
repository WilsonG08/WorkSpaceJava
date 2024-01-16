package com.entidades;

public class Carta {
	// Atributos
	private Numero numero;
	private String palo;
	private String estado;

	// Constructor que recibe ambos parametros
	public Carta(Numero numero, String palo) {
		this.numero = numero;
		this.palo = palo;
		this.estado = "N";
	}

	public Numero getNumero() {
		return numero;
	}

	public void setNumero(Numero numero) {
		this.numero = numero;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	// Meotod para mostrar informacion A-CR / 10/TR
	public void mostrarInformacion() {
		System.out.println(numero.getNumeroCarta() + "-" + palo);
	}

}
