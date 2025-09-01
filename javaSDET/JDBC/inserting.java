package JDBC;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.sql.PreparedStatement;

	public class inserting {
		public static void main(String[]args) throws SQLException, ClassNotFoundException{
			String dbURL = "jdbc:mysql://localhost:3306/2607wiprodb";
			String username = "root";
			String password = "Pj512003@";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(dbURL,username,password);
			Statement st = con.createStatement();
			String query1 = "INSERT into 2607wiprodb.shop values(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query1);
			ps.setInt(1,5);
	        ps.setString(2, "aizen");
	        ps.setString(3, "zen");       
	        ps.setDouble(4, 234.87);         
	        ps.setDouble(5, 23.00);
	        ps.setInt(1,6);
	        ps.setString(2, "rocks");
	        ps.setString(3, "xebec");       
	        ps.setDouble(4, 3456.00);         
	        ps.setDouble(5, 12.09);
			int rowsInserted = ps.executeUpdate();
			System.out.println("Rows inserted: "+ rowsInserted);
			}
		}

