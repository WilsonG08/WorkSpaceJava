package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	// Atributos
	private String cedula;
	private String nombre;
	private String apellido;
	Direccion direccion;
	private ArrayList<Telefono> telefonos;

	// Constuctor
	public Contacto(String cedula, String nombre, String apellido) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	// Imprimir
	public void imprimir() {
		System.out.println("Informacion del Contacto");
		System.out.println("Cedula: " + cedula);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Direccion: " + "\n" + "\t Calle Principal: " + direccion.getCallePrincipal() + "\n"
				+ "\t Calle Secundaria: " + direccion.getCalleSecundaria());
	}

	// Imprimir modificado
	public void imprimir1() {
		System.out.println("***" + nombre + " " + apellido + "***");
		System.out.println("Direccion: " + direccion.getCallePrincipal() + " y " + direccion.getCalleSecundaria());
	}

	// Metodo para agregar Telefono
	public void agregarTelefono(Telefono telefono) {
		if (telefonos == null) {
			telefonos = new ArrayList<Telefono>();
		} else {
			telefonos.add(telefono);
		}
	}

	// Metodo para mostrar el telefono
	public void mostrarTelefonos() {
		if (telefonos != null && !telefonos.isEmpty()) {
			boolean hayTelefonoConEstadoC = false;
			for (int i = 0; i < telefonos.size(); i++) {
				if ("C".equals(telefonos.get(i).getEstado())) {
					hayTelefonoConEstadoC = true;
					break;
				}
			}
			if (hayTelefonoConEstadoC) {
				System.out.println("Telefonos con estado 'C'");
				for (int i = 0; i < telefonos.size(); i++) {
					if ("C".equals(telefonos.get(i).getEstado())) {
						System.out.println(
								"Numero: " + telefonos.get(i).getNumero() + ",\t Tipo: " + telefonos.get(i).getTipo());
					}
				}
			}
		} else {
			System.out.println("No hay telefonos registrados para este contacto");
		}
	}

	
	
	// Recuperar los incorrectos
	public ArrayList<Telefono> recuperarIncorrectos() {
		ArrayList<Telefono> telefonosIncorrectos = new ArrayList<>();

		if (telefonos != null && !telefonos.isEmpty()) {
			for (int i = 0; i < telefonos.size(); i++) {
				Telefono telefono = telefonos.get(i);
				if ("E".equals(telefono.getEstado())) {
					telefonosIncorrectos.add(telefono);
				}
			}
		}
		return telefonosIncorrectos;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	// SETTER and GETTER
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	
}
