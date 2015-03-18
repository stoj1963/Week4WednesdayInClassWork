package week4wednesday;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectToMySqlWorkBench {

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		// Load the Drivers
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");

		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost/test", "john", "Pa$$word");
		System.out.println("Database Connected");

		Statement statement = connection.createStatement();

		//statement.executeUpdate("create table Temp (col1 char(5), col2 char(5))");
		
	/*	ResultSet resultset = statement
				.executeQuery("select firstname, lastname from customers");
		System.out.println("First Name Last Name" );
*/
		/*while (resultset.next()) {
			System.out.println(resultset.getString("firstname") + "\t     " + resultset.getString("lastname"));
		}*/
		ResultSet resultset = statement.executeQuery("desc temp");
		while (resultset.next()) {
			System.out.println(resultset.getString(1) + "\t     " + resultset.getString(2));
		}
		connection.close();
	}
}
