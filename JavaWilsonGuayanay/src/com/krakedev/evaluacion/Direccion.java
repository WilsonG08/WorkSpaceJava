package com.krakedev.evaluacion;

public class Direccion {
	private String callePrincipal;
	private String calleSecundaria;

	// Constructor para que funcione el TestDireccion
	public Direccion(String callePrincipal, String calleSecundaria) {
		super();
		this.callePrincipal = callePrincipal;
		this.calleSecundaria = calleSecundaria;
	}

	// Getter y Setters de ambos
	public String getCallePrincipal() {
		return callePrincipal;
	}

	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}

	public String getCalleSecundaria() {
		return calleSecundaria;
	}

	public void setCalleSecundaria(String calleSecundaria) {
		this.calleSecundaria = calleSecundaria;
	}

}
