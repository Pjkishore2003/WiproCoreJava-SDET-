package JDBC;
import java.sql.*;

public class Handlingresults {
	public static void main(String[]args) throws SQLException, ClassNotFoundException{
		String dbURL = "jdbc:mysql://localhost:3306/2607wiprodb";
		String username = "root";
		String password = "Pj512003@";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbURL,username,password);
		Statement st = con.createStatement();
		String sql = "SELECT * FROM shop;";
		ResultSet rs = st.executeQuery(sql);
		ResultSetMetaData meta = rs.getMetaData();
		int colCount = meta.getColumnCount();
		while(rs.next()) {
			for(int i=1; i<=colCount;i++) {
				String value = rs.getString(i);
				System.out.println(value + "\t");
			}
			System.out.println();
		}
	}

}
