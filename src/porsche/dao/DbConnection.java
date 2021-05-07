package porsche.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
 * This class implements connectivity to SQL servers.  Structure from lecture 26 August 2020 author @Promineo
 */


public class DbConnection {
	private static final String URL = "jdbc:mysql://localhost:3306/Porsche";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "M303h792!";
	private static DbConnection INSTANCE = new DbConnection();
	
	private Connection connection;
	
	private DbConnection() {
		
	}
	public static DbConnection getInstance() {
		return INSTANCE;
	}
	
	public Connection getConnection() throws SQLException {
			INSTANCE.connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("Connection Successful");
			
			return connection;
			
	}
}
