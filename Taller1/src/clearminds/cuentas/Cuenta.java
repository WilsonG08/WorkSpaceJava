package clearminds.cuentas;

public class Cuenta {
	// Atributos
	private String id;
	private double saldo;
	private String tipo;

	// Constructor
	public Cuenta(String id) {
		this.id = id;
		this.tipo = "A";
	}

	// Constructor con 3 parametros
	public Cuenta(String id, String tipo, double saldo) {
		this.id = id;
		this.saldo = saldo;
		this.tipo = tipo;
	}

	// Metodos set y get
	public String getId() {
		return id;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void mostrarCuenta() {
		System.out.println("");
		System.out.println("***********************");
		System.out.println("   CUENTA");
		System.out.println("***********************");
		System.out.println("Numero de cuenta: " + id);
		System.out.println("Tipo: " + tipo);
		System.out.println("Saldo USD: $" + saldo);
		System.out.println("***********************");
		System.out.println("");

	}

	// No recive parametros
	public void imprimirConMiEstilo() {
		System.out.println("");
		System.out.println("=============================");
		System.out.println(" ESTADO DE CUENTA DEL BANCO");
		System.out.println("=============================");
		System.out.println("");
		System.out.println("Numero de cuenta: " + id);
		System.out.println("=============================");
		System.out.println("Tipo: " + tipo);
		System.out.println("=============================");
		System.out.println("Saldo: " + saldo);
		System.out.println("=============================");
		System.out.println("");
	}

}