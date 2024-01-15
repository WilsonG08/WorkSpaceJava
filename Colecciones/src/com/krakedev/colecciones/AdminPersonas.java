package com.krakedev.colecciones;

import java.util.ArrayList;

public class AdminPersonas {
	// ArrayList como atributo
	private ArrayList<Persona> personas;

	// Constructor
	public AdminPersonas() {
		personas = new ArrayList<Persona>();
	}

	// Funcion que recibe a parametro como persona y agrega al array
	public void agregar(Persona persona) {
		personas.add(persona);
	}

	// Metodo de imprimir
	public void imprimir() {
		Persona elementoPersona;
		for (int i = 0; i < personas.size(); i++) {
			elementoPersona = personas.get(i);
			System.out.println("Persona: " + elementoPersona.getNombre() + " " + elementoPersona.getEdad());
		}
	}

	// Para buscar por nombre
	public Persona buscarPorNombre(String nombre) {
		Persona elementoPersona = null;
		Persona personaEncontrada = null;

		for (int i = 0; i < personas.size(); i++) {
			elementoPersona = personas.get(i);
			if (nombre.equals(elementoPersona.getNombre())) {
				personaEncontrada = elementoPersona;
			}
		}

		return personaEncontrada;
	}
	
	
	public ArrayList<Persona> buscarMayores(int edad){
		ArrayList<Persona> mayores = new ArrayList<Persona>();
		Persona elementoPersona = null;
		
		for(int i = 0; i < personas.size(); i++) {
			elementoPersona = personas.get(i);
			if(elementoPersona.getEdad() > edad) {
				mayores.add(elementoPersona);
			}
		}
		
		return mayores;
	}
}
