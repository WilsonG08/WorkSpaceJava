package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	// Array list de estudiante
	private ArrayList<Estudiante> estudiantes;

	public Curso() {
		estudiantes = new ArrayList<Estudiante>();
	}

	public Curso(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	
	// Metodo para buscar por estudiante, 
	// recive un estudiante, 
	// si no existe el estudiante retorna nul
	// en caso contrario un mensaje 
	public String buscarEstudiantePorCedula(Estudiante est) {

		String cedulaBuscada = est.getCedula();

		for (int i = 0; i < estudiantes.size(); i++) {
			Estudiante estudiante = estudiantes.get(i);
			if (estudiante.getCedula().equals(cedulaBuscada)) {
				System.out.println("Ya esta inscrito en el curso");
			}
		}
		return null;
	}

	
	// Meotodo para busca estudiante por celda
	// si no esta dentro del array lo agrega
	public void matricularEstudiante(Estudiante estudiante) {
		String mensaje = buscarEstudiantePorCedula(estudiante);

		if (mensaje == null) {
			estudiantes.add(estudiante);
			System.out.println("Estudiante matriculado con éxito.");
		} else {
			System.out.println(mensaje);
		}
	}

	
	// Metodo para calcular el promedio
	// Suma todos los promedios individuales
	// No recive nada y no retorna nada 
	public double calcularPromedioCurso() {
		double sumaPromedios = 0;
		int totalEstudiantes = estudiantes.size();

		if (totalEstudiantes > 0) {
			for (int i = 0; i < totalEstudiantes; i++) {
				Estudiante estudiante = estudiantes.get(i);
				ArrayList<Nota> notasEstudiante = estudiante.getNotas();
				double sumaNotas = 0;
				int totalMaterias = notasEstudiante.size();

				if (totalMaterias > 0) {
					for (int j = 0; j < totalMaterias; j++) {
						Nota nota = notasEstudiante.get(j);
						sumaNotas += nota.getCalificacion();
					}
					double promedioEstudiante = sumaNotas / totalMaterias;
					sumaPromedios += promedioEstudiante;
				}
			}

			return sumaPromedios / totalEstudiantes;
		} else {
			return 0.0;
		}
	}

	
	// Muestra la informacion del curso
	// Tiene un formato 
	public void mostrar() {
		System.out.print("Curso [estudiantes=[");
		int totalEstudiantes = estudiantes.size();

		for (int i = 0; i < totalEstudiantes; i++) {
			Estudiante estudiante = estudiantes.get(i);
			System.out.print("Estudiante [nombre=" + estudiante.getNombre() + ", apellido=" + estudiante.getApellido()
					+ ", cedula=" + estudiante.getCedula() + ", notas=[");

			ArrayList<Nota> notasEstudiante = estudiante.getNotas();
			int totalNotas = notasEstudiante.size();

			for (int j = 0; j < totalNotas; j++) {
				Nota nota = notasEstudiante.get(j);
				System.out.print("Materia [codigo=" + nota.getMateria().getCodigo() + ", nombre="
						+ nota.getMateria().getNombre() + ", calificacion=" + nota.getCalificacion() + "]");

				if (j < totalNotas - 1) {
					System.out.print(", ");
				}
			}

			System.out.print("]");

			if (i < totalEstudiantes - 1) {
				System.out.print(", ");
			}
		}

		System.out.println("]]");
	}

}