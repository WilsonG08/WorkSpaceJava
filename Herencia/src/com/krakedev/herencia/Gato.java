package com.krakedev.herencia;

// Hereda de la clase animal
public class Gato extends Animal{
	
	@Override
	public void dormir() {
		// MEtodo del padre 
		super.dormir();
		System.out.println("El gato esta vivo!!");
	}
}
