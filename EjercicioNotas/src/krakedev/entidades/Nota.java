package krakedev.entidades;

public class Nota {
	// Atributos 
	private Materia materia;
	private double calificacion;

	public Nota(double nuevaNota) {
	}

	public Nota(Materia materia, double calificacion) {
		this.materia = materia;
		this.calificacion = calificacion;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	// Metodo para mostrar informacion de la nota
	public void mostrar() {
		System.out.println("Nota [materia=" + materia.getCodigo() + ", calificacion=" + calificacion + "]");
	}

}