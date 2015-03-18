package week4wednesday;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectToOracleDatabase {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException cnfe)
		{
			System.out.println(cnfe);
		}
		/*Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;*/
		
		String dbUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "John";
		String password = "Pa$$word";
		
		try{
		Connection myConnection = DriverManager.getConnection(dbUrl, username, password);
		System.out.println("Connected to Oracle");
		Statement myStatement = myConnection.createStatement();
		
	ResultSet resultset = myStatement.executeQuery("select * from bookauthor "
				+ "");
		
		
		while (resultset.next()) {
			System.out.println(resultset.getString(1) + "\t     " + resultset.getString(2) + "\t     ");
		}
		
		myConnection.close();
		} catch(SQLException sqle) 
		{
			System.out.println(sqle);
		}
	}

}
