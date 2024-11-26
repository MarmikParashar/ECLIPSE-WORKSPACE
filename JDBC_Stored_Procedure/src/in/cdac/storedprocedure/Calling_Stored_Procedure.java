package in.cdac.storedprocedure;

import java.sql.*;
import java.util.*;

public class Calling_Stored_Procedure {

	public static void main(String[] args) {
		
		CallableStatement myStmt ;
		try {
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Sqlroot@9990");
			String theDepartment = "HR";
			
			// Prepare the stored procedure call
			
			myStmt = myConn.prepareCall("{call get_count_for_department(?,?)}");
			
			// Set the parameters
			myStmt.setString(1,theDepartment);
			myStmt.registerOutParameter(2, Types.INTEGER);
			
			
			System.out.println("Calling the Stored Procedure : \nget_count_for_department(' "+ theDepartment +"', ? )");
			
			// Call the Stored Procedure
			myStmt.execute();
			System.out.println("Calling Stored Procedure Done");
			
			int totalCount = myStmt.getInt(2);
			System.out.println("Total count = " + totalCount);
					
			} 
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
