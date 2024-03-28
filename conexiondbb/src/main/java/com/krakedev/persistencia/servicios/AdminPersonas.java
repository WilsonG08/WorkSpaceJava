package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persitencia.utils.ConexionBDD;

public class AdminPersonas {
	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);

	public static void insertar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a insertar>>> " + persona);
		try {
			// Abrir la conexion
			con = ConexionBDD.conectar();
			// Corrección en la sentencia preparada (sin comillas para los marcadores de
			// posición)
			ps = con.prepareStatement(
					"INSERT INTO personas (cedula, nombre, apellido,estado_civil_codigo, numero_hijos, estatura, cantidad_ahorrada, fecha_nacimiento, hora_nacimiento)"
							+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");

			// Ingrsa los datos
			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setString(4, persona.getEstadoCivil().getCodigo());
			ps.setInt(5, persona.getNumeroHijos());
			ps.setDouble(6, persona.getEstatura());
			ps.setBigDecimal(7, persona.getCantidadAhorrada());
			ps.setDate(8, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(9, new Time(persona.getHoraNacimiento().getTime()));

			ps.executeUpdate();

		} catch (Exception e) {
			// Logger el error
			LOGGER.error("Error al insertar!", e);

			// Mostrar el error al usuario
			throw new Exception("Error al insertar!");

		} finally { // Finaly siempre se ejecuta
			// Cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos!", e);
				throw new Exception("Error con la base de datos!");
			}
		}

	}

	// METODO DE ACTUALIZACION
	public static void actualizar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		try {
			con = ConexionBDD.conectar();
			System.out.println("Conectados");
			ps = con.prepareStatement(
					"UPDATE personas set nombre=?,apellido=?,estado_civil_codigo=?,numero_hijos=?,estatura=?,cantidad_ahorrada=?,fecha_nacimiento=?,hora_nacimiento=? WHERE cedula=?");
			ps.setString(1, persona.getNombre());
			ps.setString(2, persona.getApellido());
			ps.setString(3, persona.getEstadoCivil().getCodigo());
			ps.setInt(4, persona.getNumeroHijos());
			ps.setDouble(5, persona.getEstatura());
			ps.setBigDecimal(6, persona.getCantidadAhorrada());
			ps.setDate(7, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(8, new Time(persona.getHoraNacimiento().getTime()));
			ps.setString(9, persona.getCedula());

			ps.executeUpdate();
			System.out.println("Actualizacion exitosas");

		} catch (ClassNotFoundException | SQLException e) {
			LOGGER.error("Error de actualizacion");
			throw e;
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				LOGGER.error("Error con la base de datos");
				throw new Exception("Error con la base de datos");
			}
		}
	}
	
	//METODO PARA ELIMINAR
		public static void eliminar(String ceduEliminar) throws Exception {
			Connection con = null;
			PreparedStatement ps;
			try {
				con=ConexionBDD.conectar();
				System.out.println("Conectados");
				ps =con.prepareStatement("Delete from personas WHERE cedula=?");
				ps.setString(1, ceduEliminar);
				
					ps.executeUpdate();
					System.out.println("Eliminacion exitosas");

			} catch (ClassNotFoundException | SQLException e) {
					LOGGER.error("Error de Eliminacion");
					throw e;
			}finally {
				try {
					con.close();
				} catch (SQLException e) {
					LOGGER.error("Error con la base de datos");
					throw new Exception("Error con la base de datos");
				}
			}
		}

}
