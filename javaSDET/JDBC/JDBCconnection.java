package JDBC;
import java.sql.*;

public class JDBCconnection {
	public static void main(String[]args) throws SQLException, ClassNotFoundException{
		String dbURL = "jdbc:mysql://localhost:3306/2607wiprodb";
		String username = "root";
		String password = "Pj512003@";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbURL,username,password);
		Statement st = con.createStatement();
		String selectquery = "SELECT * FROM persons;";
		ResultSet rs = st.executeQuery(selectquery);
		while(rs.next()) {
			System.out.println(rs.getString("PersonID"));
			System.out.println(rs.getString("FirstName"));
			System.out.println("LastName");
		}
	}

}
