package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarProductoNull {
	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");

		Producto producto = new Producto("KE34", "Papitas", 0.85);
		maquina.cargarProducto(producto, "B1", 4);

		/*
		 * Aqui esta dando Null. El problema es en la variable cuando se estra tratando
		 * de acceder al nombre prod.getNombre, esta tratando de acceder a un nombre,
		 * pero la celda esta vacia es decir que no tiene ningun producto cargado
		 */
		Producto prod = maquina.buscarProductoEnCelda("A1");
		System.out.println("Producto encontrado:" + prod.getNombre());
	}
}