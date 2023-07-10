package prac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getDBConnection() throws SQLException {
		Connection conn = null;
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","admin");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return conn;
	}
}
