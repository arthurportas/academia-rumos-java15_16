package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelper {

	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	public void readDataBase() throws Exception {
		try {
			// This will load the Derby driver, each DB has its own driver
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			// Setup the connection with the DB
			connect = DriverManager.getConnection("jdbc:derby://localhost:1527/staffgest");

			// Statements allow to issue SQL queries to the database
			statement = connect.createStatement();
			// Result set get the result of the SQL query
			resultSet = statement.executeQuery("select * from employee");
			writeResultSet(resultSet);
		} catch (Exception e) {
			throw e;
		} finally {

		}
	}
	
	 private void writeResultSet(ResultSet resultSet) throws SQLException {
		    // ResultSet is initially before the first data set
		    while (resultSet.next()) {
		      // It is possible to get the columns via name
		      // also possible to get the columns via the column number
		      // which starts at 1
		      // e.g. resultSet.getSTring(2);
		      int id = resultSet.getInt("id");
		      String firstName = resultSet.getString("first_name");
		      String lastName = resultSet.getString("last_name");
		      String jobName = resultSet.getString("job_name");
		      String jobKeyResp = resultSet.getString("job_key_resp");
		      System.out.println("id: " + id);
		      System.out.println("firstName: " + firstName);
		      System.out.println("lastName: " + lastName);
		      System.out.println("jobName: " + jobName);
		      System.out.println("jobKeyResp: " + jobKeyResp);
		    }
		  }
}
