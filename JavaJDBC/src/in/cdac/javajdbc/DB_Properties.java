package in.cdac.javajdbc;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;


public class DB_Properties {

	public static void main(String[] args) throws SQLException {
		
		Connection myConn = null ;
		Statement myStmt = null ;
		ResultSet myRs = null;
		
		try {
			// 1. Load the properties load
			Properties props = new Properties();
			props.load(new FileInputStream("DB.Properties"));
			
			// Read properties file 
			String userName = props.getProperty("user");
			String password = props.getProperty("password");
			String Dburl = props.getProperty("dburl");
			
			
			
			// Get the connection
			myConn = DriverManager.getConnection(Dburl, userName, password);
			System.out.println("Connection Successfull ------");
			
			// Create the satement
			myStmt = myConn.createStatement();
			
			// Execute the database query
			myRs = myStmt.executeQuery("Select * from products") ;
			
			// Print the products table data
			while(myRs.next()) {
				System.out.println(myRs.getString("name") + " , " +myRs.getDouble("price"));
			}
			
		} 
		catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			
			if(myRs != null ) {
				myRs.close();
			}
			if(myStmt != null ) {
				myStmt.close();
			}
			if(myConn != null ) {
				myConn.close();
			}
			
			
		}
		
	}

}
