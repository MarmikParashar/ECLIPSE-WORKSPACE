package in.cdac.javajdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ProductDetails {

	public static void main(String[] args) throws Exception{
		try {
			
			// Step 1 To Create the connection with mysql database
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Javadb","root","Sqlroot@9990");
			System.out.println(conn);
			
			// Step 2 Create Statement
			
			Statement st = conn.createStatement();
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the Product Id for Searching Records : ");
			int prodId = sc.nextInt();
			
			// Fetch All the Data from Database
			ResultSet rs = st.executeQuery("Select * from products Where product_id = " + prodId);
			
					
			while(rs.next()) {
			//System.out.println("Results Stored in Table : /n " +rs);
							
			System.out.println(rs.getString(2) +",");			// Column index 2 Second column
			System.out.println(rs.getDouble(3) +",");			// Column index 4 fourth column 
			System.out.println(rs.getInt(4) +",");				// Column index 3 third column
			System.out.println();
			
			}
			
		}		
		catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}