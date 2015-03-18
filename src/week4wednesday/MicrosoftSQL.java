package week4wednesday;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MicrosoftSQL {

	public static void main(String[] args) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("Driver loaded");
		} catch (ClassNotFoundException cnfe)
		{
			System.out.println(cnfe);
		}
		/*Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;*/
		
		String dbUrl = "jdbc:sqlserver://localhost:1433;database=test;";
		String username = "john";
		String password = "sa";
		
		try{
		Connection myConnection = DriverManager.getConnection(dbUrl, username, password);
		System.out.println("Connected to Microsoft SQL");
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
