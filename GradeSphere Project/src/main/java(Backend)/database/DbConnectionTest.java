package database;

import java.sql.SQLException;

public class DbConnectionTest {

    public static void main(String[] args) {
        try (DbConnection dbConnection = new DbConnection()) {
            System.out.println("Database connection established successfully!");

            // Execute a test query
            String testQuery = "SELECT 1";
            dbConnection.stm = dbConnection.con.createStatement();
            dbConnection.rs = dbConnection.stm.executeQuery(testQuery);

            if (dbConnection.rs.next()) {
                System.out.println("Test query executed successfully: " + dbConnection.rs.getInt(1));
            }

        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}