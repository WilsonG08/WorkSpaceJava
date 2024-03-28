package com.krakedev.conexiondbb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TestReto {

    public static void main(String[] args) {
        // Registro del driver
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }

        // Para la conexión
        Connection connection = null;
        PreparedStatement ps = null;

        try {
        	connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Datos", "postgres", "postgres");
            System.out.println("Conexión exitosa!");

            // Inserción en tabla1
            ps = connection.prepareStatement("INSERT INTO tabla1 (varchar_columna, int_columna, money_columna, date_columna) VALUES (?, ?, ?, ?)");

            ps.setString(1, "Ejemplo1");
            ps.setInt(2, 25);
            ps.setBigDecimal(3, java.math.BigDecimal.valueOf(100.50));  

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fechaStr1 = "2022-01-23";

            try {
                Date fecha1 = sdf.parse(fechaStr1);
                java.sql.Date fechaSQL1 = new java.sql.Date(fecha1.getTime());
                ps.setDate(4, fechaSQL1);

                ps.executeUpdate();
                System.out.println("Inserción en tabla1 realizada con éxito!");

            } catch (ParseException e) {
                e.printStackTrace();
            }

            // Inserción en tabla2
            ps = connection.prepareStatement("INSERT INTO tabla2 (varchar_columna, int_columna, money_columna, date_columna) VALUES (?, ?, ?, ?)");

            ps.setString(1, "Ejemplo2");
            ps.setInt(2, 30);
            ps.setBigDecimal(3, java.math.BigDecimal.valueOf(150.75));

            String fechaStr2 = "2022-01-24";

            try {
                Date fecha2 = sdf.parse(fechaStr2);
                java.sql.Date fechaSQL2 = new java.sql.Date(fecha2.getTime());
                ps.setDate(4, fechaSQL2);

                ps.executeUpdate();
                System.out.println("Inserción en tabla2 realizada con éxito!");

            } catch (ParseException e) {
                e.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
