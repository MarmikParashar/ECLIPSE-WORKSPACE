package in.cdac.javajdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class DataOperations {
	char choice;
	
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char choice = 'n';
		do {
			
			try {				  
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Javadb","root","Sqlroot@9990");
//				Statement stmt = conn.createStatement();
				
				// Two PreparedSatement, one for insert and second for select
				PreparedStatement pstmt = conn.prepareStatement("insert into products(name, price, quantity) values(?,?,?)");
				
				
				PreparedStatement pstmt2 = conn.prepareStatement("select * from products");
				
				
				System.out.print("Enter the product name: ");
				String prodName = sc.next();
				
				System.out.print("Enter the product price: ");
				double prodPrice = sc.nextDouble();
				
				System.out.print("Enter the product quantity: ");
				int prodQuan = sc.nextInt();
				
				pstmt.setString(1, prodName);
				pstmt.setDouble(2, prodPrice);
				pstmt.setInt(3, prodQuan);
				
				int result = pstmt.executeUpdate();
				System.out.println(result + "row(s) inserted");
				
				ResultSet rs = pstmt.executeQuery("select * from products");
				
				
				
				while(rs.next()) {
					System.out.println(rs.getInt("product_id") + ", " + rs.getString("name") + ", " + rs.getDouble("price") + ", " + rs.getInt("quantity"));
				}
				
				
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}

			System.out.println("Do you want to perform insert operation again...(y/n)");
			choice = sc.next().charAt(0);
			
		}
		while(choice == 'y' || choice =='Y');
		

	}

}

