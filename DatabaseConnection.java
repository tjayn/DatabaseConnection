/*
 * Program To Show Connection Of A Database Using Java
 * Author: Thuku Josphat Wamwago
 * Reg No: CT101/G/19448/23
 * Date: 19/3/2025
 * Version: 1
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static void main(String[] args) {
        // JDBC URL, username, and password of MySQL server
        String url = "jdbc:mysql://localhost:3306/yourDatabaseName";
        String user = "yourUsername";
        String password = "yourPassword";

        // Connection reference
        Connection connection = null;

        try {
            // Establish connection
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established successfully!");
        } catch (SQLException e) {
            System.out.println("An error occurred while connecting to the database.");
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
