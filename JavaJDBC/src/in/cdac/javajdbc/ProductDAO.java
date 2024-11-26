package in.cdac.javajdbc;
import java.sql.*;

public class ProductDAO {

	public static void main(String[] args) throws Exception{
		try {
			
			// Step 1 To Create the connection with mysql database
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Javadb","root","Sqlroot@9990");
			System.out.println(conn);
			
			// Step 2 Create Statement
			
			Statement st = conn.createStatement();
			
			// Step 3 Create Result variable
			// Used for DML Statements like Insert , Update , Delete
//			int resutl1 = st.executeUpdate("INSERT INTO products(name , price , quantity)"
//					+ "values('Mouse' , 1500.75 , 300 )");
//			
//			int result2 = st.executeUpdate("INSERT INTO products(name , price , quantity) "
//					+ "values('Monitor' , 10000.89 , 100 ),"
//					+ "('Graphic Card' , 5000.89 , 50),"
//					+ "('Keyboard' , 1400.99 , 150);  ");	
//			
//			System.out.println(resutl1 + " Row(s) Inserted");
//			System.out.println(result2 + " Row(s) Inserted ");
			
			// Fetch All the Data from Database
			ResultSet rs = st.executeQuery("Select * from products");
			
			while(rs.next()) {
				//System.out.println("Results Stored in Table : /n " +rs);
				
				System.out.println(rs.getString(2));			// Column index 2 Second column
				System.out.println(rs.getDouble(3));			// Column index 4 fourth column 
				System.out.println(rs.getInt(4));				// Column index 3 third column
				System.out.println();
				
			}
			
//			int result3 = st.executeUpdate("Delete from products where product_id = 105 ;");
//			System.out.println(result3 + "Row(s) Deleted");
		 				
			int result4 = st.executeUpdate("Update products SET price = 1500.64 "
					+ "Where name = 'Keyboard' ;");
			
			System.out.println(result4 + " Row(s) Updated");
			
		} 
		catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
