package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	// Atributos
	private String cedula;
	private String nombre;
	private String apellido;

	private ArrayList<Nota> notas;

	public Estudiante(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		notas = new ArrayList<Nota>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

	
	// Metodo para agregar nota y recive un parametro
	public void agregarNota(Nota nuevaNota) {
		double calificacion = nuevaNota.getCalificacion();
		String codigoMateria = nuevaNota.getMateria().getCodigo();

		if (calificacion >= 0 && calificacion <= 10) {
			boolean notaExistente = false;

			for (int i = 0; i < notas.size(); i++) {
				Nota nota = notas.get(i);
				if (nota.getMateria().getCodigo().equals(codigoMateria)) {
					notaExistente = true;
					break;
				}
			}

			if (!notaExistente) {
				notas.add(nuevaNota);
				System.out.println("Nueva nota añadida correctamente");
			} else {
				System.out.println("Ya existe una nota con el codigo " + codigoMateria + ".");
			}
		} else {
			System.out.println("Error : La nueva nota debe estar entre 0 y 10.");
		}
	}

	
	// Metodo para modificar la nota, recive dos parametros y no retorna nada 
	public void modificarNota(String codigoMateria, double nuevaNota) {
		if (nuevaNota >= 0 && nuevaNota <= 10) {
			boolean materiaEncontrada = false;

			for (int i = 0; i < notas.size(); i++) {
				Nota nota = notas.get(i);
				if (nota.getMateria().getCodigo().equals(codigoMateria)) {
					nota.setCalificacion(nuevaNota);
					materiaEncontrada = true;
					System.out
							.println("Calificación modificada con éxito para la materia con código: " + codigoMateria);
					break;
				}
			}

			if (!materiaEncontrada) {
				System.out.println("No se encontró una materia con el código " + codigoMateria + ".");
			}
		} else {
			System.out.println("La nueva calificación debe estar entre 0 y 10.");
		}
	}

	
	// Metodo para calcular le promedio, no recive parametros y retorna le promedio del estudiante
	public double calcularPromedioNotasEstudiante() {
		double sumaNotas = 0.0;
		int totalMaterias = notas.size();

		if (totalMaterias == 0) {
			System.out.println("El estudiante " + nombre + " " + apellido
					+ " no tiene calificaciones registradas. El promedio es 0.");
			return 0.0;
		}

		for (int i = 0; i < notas.size(); i++) {
			Nota nota = notas.get(i);
			sumaNotas += nota.getCalificacion();
		}
		double promedio = sumaNotas / totalMaterias;
		return promedio;
	}

	
	// MEtodo para mostrar,no recive parametros y no retorna nada 
	public void mostrar() {
		String infoEstudiante = "Estudiante [cedula=" + cedula + ",nombre=" + nombre + ",apellido=" + apellido + "]";
		System.out.println(infoEstudiante);
		for (int i = 0; i < notas.size(); i++) {
			String infoNota = "Nota [materia=" + notas.get(i).getMateria().getNombre() + ", calificacion="
					+ notas.get(i).getCalificacion() + "]";
			System.out.println(infoNota);
		}
	}
}	