package com.platinum.web.tests;

import static org.junit.Assert.assertNotNull;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.Test;

public class DatabaseConnectionTest {

    @Test
    public void testConnection() {
        String jdbcUrl = "jdbc:mysql://localhost:3306/Cuentas_clientes";
        String username = "root"; // Usuario de MySQL, nunca se lo cambie
        String password = "1234"; // Contraseña de MySQL

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            assertNotNull(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
