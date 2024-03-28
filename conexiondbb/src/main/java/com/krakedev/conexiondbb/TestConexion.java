package com.krakedev.conexiondbb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		// REgistrar el driver

		// Para la conexion
		Connection connection = null;
		PreparedStatement ps = null;

		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Datos", "postgres", "postgres");
			System.out.println("Conexion exitosa!");

			// Corrección en la sentencia preparada (sin comillas para los marcadores de
			// posición)
			ps = connection.prepareStatement("INSERT INTO persona (cedula, nombre, apellido, fecha_nacimiento, hora_nacimiento)" 
			+ " VALUES (?, ?, ?, ?, ?)");

			// Ingrsa los datos
			ps.setString(1, "1718688284");
			ps.setString(2, "Wilson");
			ps.setString(3, "Guayanay");
	

			// Convertir --> pagina de internet ver formato
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr = "2020/03/22 10:05:04";
			try {

				Date fecha = sdf.parse(fechaStr);
				System.out.println(fecha);

				// Fecha en milisegundos
				long fechaMilis = fecha.getTime();
				System.out.println(fechaMilis);

				// Es de SQL
				// Crea un java.sqlDate, partiendo de un java.util.Date
				java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
				System.out.println(fechaSQL);

				Time timeSQL = new Time(fechaMilis);
				System.out.println(timeSQL);

				
				// Para enviar la fecha y hora
				ps.setDate(4, fechaSQL);
				ps.setTime(5, timeSQL);
				
				// Ejecutar la sentencia
				ps.executeUpdate();
				System.out.println("Ejecuto!");

			} catch (ParseException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
