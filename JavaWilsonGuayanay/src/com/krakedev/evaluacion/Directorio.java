package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	// Atributos
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	private ArrayList<Contacto> correctos = new ArrayList<>();
	private ArrayList<Contacto> incorrectos = new ArrayList<>();

	// Constrcutor vacio con Date
	public Directorio() {
		contactos = new ArrayList<>();
		fechaModificacion = new Date();
	}

	// Metodo para buscar por cedula
	public Contacto buscarPorCedula(String cedula) {
		for (int i = 0; i < contactos.size(); i++) {
			Contacto contacto = contactos.get(i);
			if (contacto.getCedula().equals(cedula)) {
				return contacto;
			}
		}
		return null;
	}

	// Metodo para agregar contacto
	public boolean agregarContacto(Contacto contacto) {
		if (contactos == null) {
			contactos = new ArrayList<>();
		}

		// Verificar si la cédula ya existe en la lista
		if (buscarPorCedula(contacto.getCedula()) == null) {
			contactos.add(contacto);

			// Actualizar la fecha de modificación
			fechaModificacion = new Date();

			return true; // Se pudo agregar el contacto
		} else {
			return false; // La cédula ya existe en la lista
		}
	}

	// MEtodo para consultar la ultima modificacion
	public String consultarUltimaModificacion() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd:HH:mm:ss");
		return dateFormat.format(fechaModificacion);
	}

	// MEtodo para contrar perdidos
	public int contarPerdidos() {
		int count = 0;
		for (int i = 0; i < contactos.size(); i++) {
			if (contactos.get(i).getDireccion() == null) {
				count++;
			}
		}
		return count;
	}

	// COntar fijos
	public int contarFijos() {
		int count = 0;
		for (int i = 0; i < contactos.size(); i++) {
			Contacto contacto = contactos.get(i);
			ArrayList<Telefono> telefonos = contacto.getTelefonos();

			if (telefonos != null && !telefonos.isEmpty()) {
				for (int j = 0; j < telefonos.size(); j++) {
					Telefono telefono = telefonos.get(j);
					if ("Convencional".equals(telefono.getTipo()) && "C".equals(telefono.getEstado())) {
						count++;
						// No salimos del bucle interno, ya que un contacto podría tener varios
						// teléfonos
					}
				}
			}
		}
		return count;
	}

	// Metodo para depurar
	public void depurar() {
		for (int i = 0; i < contactos.size(); i++) {
			Contacto contacto = contactos.get(i);

			if (contacto.getDireccion() != null) {
				correctos.add(contacto);
			} else {
				incorrectos.add(contacto);
			}
		}
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}

}
