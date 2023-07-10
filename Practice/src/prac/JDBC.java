package prac;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JDBC {

	public static void main(String[] args) {
		//register driver
		try {
			
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			//coonection establish
			
			
			//create stmt
			
			
			//crud
			
			
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		
	}

}
