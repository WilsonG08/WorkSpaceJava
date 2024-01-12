package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		// Creo el objeto cuenta y lo referencio
		Cuenta cuenta1 = new Cuenta("03476");

		// Coloco un valor de saldo en la cuenta 1
		cuenta1.setSaldo(675);

		// Creo el objeto Cuenta y lo referencio con cuenta 2
		Cuenta cuenta2 = new Cuenta("03476", "C", 98);

		// Creo el objeeto Cuenta y lo referencio con cuenta 3
		Cuenta cuenta3 = new Cuenta("03476");

		// Modifico el tipo de cuenta
		cuenta3.setTipo("C");

		// Imprimo cuenta 1, cuenta 2 y cuenta 3
		System.out.println("------------Valores Iniciales ----------");
		cuenta1.mostrarCuenta();
		cuenta2.mostrarCuenta();
		cuenta3.mostrarCuenta();

		// Valores modificados
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(576);
		cuenta2.setTipo("D");

		System.out.println("------------Valores Modificados ----------");
		cuenta1.mostrarCuenta();
		cuenta2.mostrarCuenta();
		cuenta3.mostrarCuenta();

		// Creo el objeto Cuenta y lo refiero con cuenta 4
		Cuenta cuenta4 = new Cuenta("0987");
		cuenta4.setTipo("A");
		cuenta4.setSaldo(10);

		// Creo el objeto Cuenta y lo refiero con cuenta 5
		Cuenta cuenta5 = new Cuenta("0557", "C", 10);


		// Creo el objeto Cuenta y lo refiero con cuenta 6
		Cuenta cuenta6 = new Cuenta("0666", "A", 0);
		
		// Impresion con mi estilo
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();
		

	}

}