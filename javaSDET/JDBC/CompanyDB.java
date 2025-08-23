package JDBC;
import java.sql.*;

public class CompanyDB {
	public static void main(String[] args) {
        String rootURL = "jdbc:mysql://localhost:3306/";
        String dbName = "companydb";
        String dbURL = rootURL + dbName;
        String username = "root";
        String password = "Pj512003@";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection(rootURL, username, password);
                 Statement st = con.createStatement()) {
                st.executeUpdate("CREATE DATABASE IF NOT EXISTS " + dbName);
                System.out.println("Database created");
            }
            try (Connection con = DriverManager.getConnection(dbURL, username, password);
                 Statement st = con.createStatement()) {
                String createTable = "CREATE TABLE IF NOT EXISTS employees (" +
                        "id INT PRIMARY KEY," +
                        "name VARCHAR(50)," +
                        "department VARCHAR(50)," +
                        "salary DOUBLE)";
                st.executeUpdate(createTable);
                System.out.println("Table created.");
                String insert = "INSERT INTO employees (id, name, department, salary) VALUES (?, ?, ?, ?)";
                PreparedStatement psInsert = con.prepareStatement(insert);
                psInsert.setInt(1, 108);
                psInsert.setString(2, "Alice");
                psInsert.setString(3, "HR");
                psInsert.setDouble(4, 50000);
                psInsert.executeUpdate();
                psInsert.setInt(1, 102);
                psInsert.setString(2, "Bob");
                psInsert.setString(3, "IT");
                psInsert.setDouble(4, 65000);
                psInsert.executeUpdate();
                psInsert.setInt(1, 103);
                psInsert.setString(2, "Charlie");
                psInsert.setString(3, "Sales");
                psInsert.setDouble(4, 60000);
                psInsert.executeUpdate();

                System.out.println("Employees inserted.");

                System.out.println("All Employees:");
                ResultSet rsAll = st.executeQuery("SELECT * FROM employees");
                while (rsAll.next()) {
                    System.out.println(rsAll.getInt("id") + " | " + rsAll.getString("name") + " | " +
                            rsAll.getString("department") + " | " + rsAll.getDouble("salary"));
                }

                System.out.println("Employee with ID 102:");
                ResultSet rsById = st.executeQuery("SELECT * FROM employees WHERE id = 102");
                while (rsById.next()) {
                    System.out.println(rsById.getInt("id") + " | " + rsById.getString("name"));
                }

                System.out.println("Employees in IT Department:");
                ResultSet rsDept = st.executeQuery("SELECT * FROM employees WHERE department = 'IT'");
                while (rsDept.next()) {
                    System.out.println(rsDept.getInt("id") + " | " + rsDept.getString("name"));
                }

                st.executeUpdate("UPDATE employees SET salary = 70000 WHERE id = 102");
                System.out.println("Salary updatedID 102.");

                st.executeUpdate("UPDATE employees SET department = 'Finance' WHERE name = 'Alice'");
                System.out.println("Department updated for Alice.");

                st.executeUpdate("DELETE FROM employees WHERE id = 103");
                System.out.println("Deleted employeeID 103.");

                st.executeUpdate("DELETE FROM employees WHERE department = 'Sales'");
                System.out.println("Deleted all employees 'Sales' department.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
