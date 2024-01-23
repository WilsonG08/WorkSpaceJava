package com.krakedev.conexiondbb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
			
			// Corrección en la sentencia preparada (sin comillas para los marcadores de posición)
            ps = connection.prepareStatement("INSERT INTO persona (cedula, nombre, apellido)"
            		+ " VALUES (?, ?, ?)");
            
			// Ingrsa los datos
			ps.setString(1, "1718688284");
			ps.setString(2, "Wilson");
			ps.setString(3, "Guayanay");
			
			
			// Ejecutar la sentencia 
			ps.executeUpdate();
			System.out.println("Ejecuto!");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
