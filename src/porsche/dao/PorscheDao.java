package porsche.dao;
/*
 * This class implements the data layer for the Porsche table.  Framework from Lecture 26 Aug 2020 @author Promineo
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import porsche.entity.Porsche;




public class PorscheDao {

	public void createPorsche(String name) throws SQLException {
		String sql = "INSERT INTO porsche (name) VALUES (?)";
		Connection connection  = null;
		PreparedStatement statement = null;
		try {
			connection = DbConnection.getInstance().getConnection();
			statement = connection.prepareStatement(sql);
			statement.setString(1, name);
			statement.executeUpdate();
		}
		finally {
			if(statement !=null) {
				statement.close();
			
		}
			if(connection !=null) {
				connection.close();
				
			}
		}
	public List<Porsche> fetchPorsche() throws SQLException {
			String sql = "SELECT * FROM porsche";
			Connection connection = null;
			preparedStatement statement = null;
			ResultSet resultSet = null;
			List<Porsche> porsche = new ArrayList<>();
		}
	try {
		Connection = DbConnection.getInstance().getConnection();
		statement = connection.prepareStatement(sql);
		resultSet = statement.executeQuery();
		
		while (resultSet.next()) {
				long porscheId = resultSet.getLong("porsche_id");
				String name = resultSet.getString("name");
				Porsche porsche = new Porsche(porscheId, name);
				Porsche.add(porsche);
			}
		return porsche;
			}
		finally {
			if(resultSet != null) {
				resultSet.close();
			}
			if (statement != null) {
				statement.close();
			}
			if(Connection != null) {
				Connection.close();
			}
		}
	public void modifyPorsche(long id, String name) throws SQLException {
			String sql = "UPDATE Porsche SET name = ? WHERE porsche_id = ?";
			Connection connection = null;
			PreparedStatement statement = null;
			
		try {
			connection = DbConnection.getInstance().getConnection();
			statement = connection.prepareStatement(sql);
			statement.setString(1, name);
			statement.setLong(2, id);
			statement.executeUpdate();
			
		}
			finally {
				if (statement != null) {
					statement.close();
				if (Connection != null) {
					Connection.close();
				}
				}
			}
	public void deletePorsche(long porsche_id) throws SQLException {
			String SQL = "DELETE FROM Porsche WHERE Porsche_id = ?";
			Connection connection = null;
			PreparedStatement statement = null;
		try {
			Connection = DbConnection.getInstance().getConnection();
			statement = connection.prepareStatement(sql);
			statement.setLong(1, porsche_id);
			statement.executeUpdate();
		
		}
			finally {
				if (statement != null) {
					statement.close();
				}
				if (Connection !=null) {
					Connection.close();
				}
			}
			}
		}
	}

	 {
	
	}
}