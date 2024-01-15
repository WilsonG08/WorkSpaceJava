package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	// Atributos
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	// Metodos
	public void configurarMaquina(String codigoCelda1, String codigoCelda2, String codigoCelda3, String codigoCelda4) {
		celda1 = new Celda(codigoCelda1);
		celda2 = new Celda(codigoCelda2);
		celda3 = new Celda(codigoCelda3);
		celda4 = new Celda(codigoCelda4);
	}

	public void mostrarConfiguracion() {
		System.out.println("**** CELDAS ****");
		System.out.println("Celda 1 : " + celda1.getCodigo());
		System.out.println("Celda 2 : " + celda2.getCodigo());
		System.out.println("Celda 3 : " + celda3.getCodigo());
		System.out.println("Celda 4 : " + celda4.getCodigo());
		System.out.println("Saldo actual : " + saldo);
		System.out.println("***********************");
	}

	public Celda buscarCelda(String codigoCelda) {
		if (celda1 != null && celda1.getCodigo().equals(codigoCelda)) {
			return celda1;
		}
		if (celda2 != null && celda2.getCodigo().equals(codigoCelda)) {
			return celda2;
		}
		if (celda3 != null && celda3.getCodigo().equals(codigoCelda)) {
			return celda3;
		}
		if (celda4 != null && celda4.getCodigo().equals(codigoCelda)) {
			return celda4;
		}
		return null;
	}

	public void cargarProducto(Producto producto, String codigoCelda, int cantidadInicial) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		if (celdaRecuperada != null) {
			celdaRecuperada.ingresarProducto(producto, cantidadInicial);
		}
	}

	public void mostrarProductos() {
		System.out.println("*********** CELDA A1");
		imprimirDetallesCelda(celda1);
		System.out.println("*********** CELDA A2");
		imprimirDetallesCelda(celda2);
		System.out.println("*********** CELDA B1");
		imprimirDetallesCelda(celda3);
		System.out.println("*********** CELDA B2");
		imprimirDetallesCelda(celda4);
		// System.out.println("Saldo: " + saldo);
	}

	private void imprimirDetallesCelda(Celda celda) {
		if (celda != null) {
			System.out.println("Saldo: " + saldo);
			System.out.println("Stock : " + celda.getStock());
			if (celda.getProducto() != null) {
				System.out.println("Nombre: Producto: " + celda.getProducto().getNombre());
				System.out.println("Precio Producto : " + celda.getProducto().getPrecio());
				System.out.println("Codigo: Producto: " + celda.getProducto().getCodigo());
			} else {
				System.out.println("La celda no tiene producto!!!");
			}
			// System.out.println("Saldo: " + saldo);
		}
	}

	public Producto buscarProductoEnCelda(String codigoCelda) {
		Celda celdaBuscada = buscarCelda(codigoCelda);

		if (celdaBuscada != null) {
			Producto productoEnCelda = celdaBuscada.getProducto();
			return productoEnCelda;
		} else {
			return null;
		}
	}

	public double consultarPrecio(String codigoCelda) {
		Celda celdaBuscada = buscarCelda(codigoCelda);

		if (celdaBuscada != null && celdaBuscada.getProducto() != null) {
			double precioProducto = celdaBuscada.getProducto().getPrecio();
			return precioProducto;
		} else {

			return 0;
		}
	}

	public Celda buscarCeldaProducto(String codigoProducto) {
		if (celda1 != null && celda1.getProducto() != null && celda1.getProducto().getCodigo().equals(codigoProducto)) {
			return celda1;
		}
		if (celda2 != null && celda2.getProducto() != null && celda2.getProducto().getCodigo().equals(codigoProducto)) {
			return celda2;
		}
		if (celda3 != null && celda3.getProducto() != null && celda3.getProducto().getCodigo().equals(codigoProducto)) {
			return celda3;
		}
		if (celda4 != null && celda4.getProducto() != null && celda4.getProducto().getCodigo().equals(codigoProducto)) {
			return celda4;
		}
		return null;
	}

	public void incrementarProductos(String codigoProducto, int cantidadIncrementar) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);

		if (celdaEncontrada != null && celdaEncontrada.getProducto() != null) {
			int stockActual = celdaEncontrada.getStock();
			celdaEncontrada.setStock(stockActual + cantidadIncrementar);
		}
	}

	public void vender(String codigoCelda) {
		Celda celdaBuscada = buscarCelda(codigoCelda);

		if (celdaBuscada != null && celdaBuscada.getProducto() != null && celdaBuscada.getStock() > 0) {

			int stockActual = celdaBuscada.getStock();
			celdaBuscada.setStock(stockActual - 1);

			double precioProducto = celdaBuscada.getProducto().getPrecio();

			saldo += precioProducto;

			mostrarProductos();
			System.out.println("Saldo actual de la máquina: " + saldo);
		}
	}

	public double venderConCambio(String codigoCelda, double valorIngresado) {

		Celda celdaBuscada = buscarCelda(codigoCelda);

		if (celdaBuscada != null && celdaBuscada.getProducto() != null && celdaBuscada.getStock() > 0) {

			int stockActual = celdaBuscada.getStock();
			celdaBuscada.setStock(stockActual - 1);

			double precioProducto = celdaBuscada.getProducto().getPrecio();

			saldo += precioProducto;

			double cambio = valorIngresado - precioProducto;

			return cambio;
		} else {

			return valorIngresado;
		}
	}

	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}