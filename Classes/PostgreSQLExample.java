import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgreSQLExample {
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://localhost:5432/mydatabase";
    static final String USER = "username";
    static final String PASS = "password";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Create table
            stmt = conn.createStatement();
            String createTableSql = "CREATE TABLE employees " +
                    "(id SERIAL PRIMARY KEY, name VARCHAR(50), age INTEGER)";
            stmt.executeUpdate(createTableSql);
            System.out.println("Table created successfully!");

            // Insert records
            String insertSql = "INSERT INTO employees (name, age) VALUES (?, ?)";
            PreparedStatement insertStmt = conn.prepareStatement(insertSql);
            insertStmt.setString(1, "John Doe");
            insertStmt.setInt(2, 30);
            insertStmt.executeUpdate();
            System.out.println("Record inserted successfully!");

            // Read records
            String selectSql = "SELECT id, name, age FROM employees";
            ResultSet rs = stmt.executeQuery(selectSql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

            // Update record
            String updateSql = "UPDATE employees SET age = ? WHERE name = ?";
            PreparedStatement updateStmt = conn.prepareStatement(updateSql);
            updateStmt.setInt(1, 35);
            updateStmt.setString(2, "John Doe");
            int rowsUpdated = updateStmt.executeUpdate();
            System.out.println("Records updated: " + rowsUpdated);

            // Delete record
            String deleteSql = "DELETE FROM employees WHERE name = ?";
            PreparedStatement deleteStmt = conn.prepareStatement(deleteSql);
            deleteStmt.setString(1, "John Doe");
            int rowsDeleted = deleteStmt.executeUpdate();
            System.out.println("Records deleted: " + rowsDeleted);

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}
