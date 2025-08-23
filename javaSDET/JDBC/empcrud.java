package JDBC;
import java.sql.*;

public class empcrud {
    public static void main(String[] args) {
        String dbURL = "jdbc:mysql://localhost:3306/COMPANY";
        String username = "root";
        String password = "Pj512003@"; 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(dbURL, username, password);

            // inserting
            String insertQy = "INSERT INTO employees (id, name, department, salary) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(insertQy);
            ps.setInt(1, 105);
            ps.setString(2, "aizen");
            ps.setString(3, "EEE");
            ps.setDouble(4, 550876);
            ps.executeUpdate();
            System.out.println("Employee inserted");
            String selectQy = "SELECT * FROM employees";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(selectQy);
            System.out.println("\n Employee Records:");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getString("department") + " | " +
                    rs.getDouble("salary")
                );
            }

            // updating
            String updateQuery = "UPDATE employees SET salary = ? WHERE id = ?";
            PreparedStatement us = con.prepareStatement(updateQuery);
            us.setDouble(1, 60000);
            us.setInt(2, 105);
            us.executeUpdate();
            System.out.println("Employee salary updated.");

            // deleting
            String deleteQuery = "DELETE FROM employees WHERE id = ?";
            PreparedStatement dt = con.prepareStatement(deleteQuery);
            dt.setInt(1, 105);
            dt.executeUpdate();
            System.out.println(" Employee deleted.");
            rs.close();
            ps.close();
            us.close();
            dt.close();
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
