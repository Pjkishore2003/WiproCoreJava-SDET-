package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class PrepStatements {
	public static void main(String[]args) throws SQLException, ClassNotFoundException{
		String dbURL = "jdbc:mysql://localhost:3306/2607wiprodb";
		String username = "root";
		String password = "Pj512003@";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbURL,username,password);
		Statement st = con.createStatement();
		String query1 = "SELECT * FROM shop WHERE FirstName ='kishore' and Discount =' 10.00'";
		String query2 = "SELECT * FROM shop WHERE FirstName = ? and Discount = ?";
		PreparedStatement ps = con.prepareStatement(query2);
		ps.setString(1,"kishore");
		ps.setDouble(2, 10.00);
		ResultSet rs = ps.executeQuery(query1);
		while(rs.next()) {
		
			System.out.println(rs.getString("LastName"));
			System.out.println(rs.getInt("CustomerID"));
			System.out.println(rs.getDouble("TransactionAmount"));
		}
	}

}

