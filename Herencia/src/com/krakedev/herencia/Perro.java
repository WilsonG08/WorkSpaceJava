package com.krakedev.herencia;

// extends es para heredar
public class Perro extends Animal {
	
	public Perro() {
		System.out.println("Ejecuta constructor de perro");
	}
	
	public void ladrar() {
		System.out.println("Perro ladrando");
	}
	
	@Override
	public void dormir() {
		// MEtodo del padre 
		super.dormir();
		System.out.println("Perro durmiendo");
	}

}
