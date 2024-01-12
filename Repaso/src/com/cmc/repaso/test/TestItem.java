package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		// Instancia del objeto
		Item item1 = new Item();
		Item item2 = new Item();
		Item item3 = new Item();
		Item item4 = new Item();

		// Seteo de Producto actual con 20
		item1.setProductosActuales(20);
		item1.setNombre("Deterjente");
		item1.setProductosDevueltos(0);
		item1.setProductosVendidos(0);
		item1.imprimir();

		item2.setProductosActuales(15);
		item2.setNombre("Arroz");
		item2.setProductosDevueltos(0);
		item2.setProductosVendidos(0);
		item2.imprimir();
		item2.devolver(5);
		System.out.println("Producto devuelto 5 de Arroz");
		item2.imprimir();

		item3.setProductosActuales(21);
		item3.setNombre("Cuadernos");
		item3.setProductosDevueltos(0);
		item3.setProductosVendidos(1);
		item3.imprimir();
		item3.vender(6);
		System.out.println("Producto vendido 6 de Cuadernos");
		item3.imprimir();

	}

}