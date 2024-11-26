package in.cdac.jdbccrud;

import java.util.*;



import java.sql.*;


class CRUD {
	
	public static void addProduct()   {
		
		Scanner sc = new Scanner(System.in);
		// try-with-resources
		
		try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Javadb","root","Sqlroot@9990");
			PreparedStatement pstmt = conn.prepareStatement("insert into products(name, price, quantity) values(?,?,?)");
				)
		{
			// Body of try block
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
			
			
		} 
		catch (SQLException ex) {
			System.out.println("SQL Exception : " + ex.getMessage());
			System.out.println("SQL State : " + ex.getSQLState());
			System.out.println("Vendor Error : " + ex.getErrorCode() );
		}
		sc.close();
	}
	
	public static void updateProduct () {
		Scanner sc = new Scanner(System.in);
	try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Javadb","root","Sqlroot@9990");
			PreparedStatement pstmt2 = conn.prepareStatement("UPDATE products set name = ? WHERE product_id = ? ");
			PreparedStatement pstmt3 = conn.prepareStatement("UPDATE products set price = ? WHERE product_id = ? ");
			PreparedStatement pstmt4 = conn.prepareStatement("UPDATE products set quantity = ? WHERE product_id = ? ");
			)
	
	{
		
		System.out.print("Enter the product id: ");
		int prodId = sc.nextInt();
		
		PreparedStatement pstmt1 = conn.prepareStatement("Select * from products Where product_id = " + prodId);
		
		ResultSet rs = pstmt1.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt("product_id") + ", " + rs.getString("name") + ", " + rs.getDouble("price") + ", " + rs.getInt("quantity"));
		}
		System.out.println("Enter the field you want to update  : ");
		System.out.println("\t1 Name");
		System.out.println("\t2 Price");
		System.out.println("\t3 Quantity");
		System.out.print("Your Choice : ");
		int field = sc.nextInt();
		
		switch (field) {
		case 1: {
			
			System.out.print("Enter Updated Product Name : ");
			String prodName = sc.next();
			
			pstmt2.setString(1, prodName);
			pstmt2.setInt(2, prodId);
			int result = pstmt2.executeUpdate();
			System.out.println(result + "row(s) updated");
			break;
		}
		case 2 : {
			System.out.println("Enter Updated Product Price : ");
			double prodPrice = sc.nextDouble();
			
			pstmt3.setDouble(1, prodPrice);
			pstmt3.setInt(2, prodId);
			int result = pstmt3.executeUpdate();
			System.out.println(result + "row(s) updated");
			break;
		}	
		case 3 : {
			System.out.println("Enter Update Product Quantity : ");
			int prodQuan = sc.nextInt();
		
			pstmt4.setInt(1, prodQuan);
			pstmt4.setInt(2, prodId);
			int result = pstmt4.executeUpdate();
			System.out.println(result + "row(s) updated");
		}
		default:
			System.out.println("Invalid Choice for updation");
			System.out.println("Enter Choice Between (1,2,3)");
		
		
		}
	}
		 
	catch (SQLException ex) {
		System.out.println("SQL Exception : " + ex.getMessage());
		System.out.println("SQL State : " + ex.getSQLState());
		System.out.println("Vendor Error : " + ex.getErrorCode() );
	}	
	sc.close();	
	}
	
	public static void deleteProduct() {
		Scanner sc = new Scanner(System.in);
		try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Javadb","root","Sqlroot@9990");
				PreparedStatement pstmt5 = conn.prepareStatement("Delete from product where product_id = ? ");	)
		{
			System.out.println("Enter the Product ID :");
			int prodId = sc.nextInt();
			
			pstmt5.setInt(1, prodId);
			
			int result = pstmt5.executeUpdate();
			System.out.println(result + "row(s) deleted Successfully");
			
		} 
		catch (SQLException ex) {
			System.out.println("SQL Exception : " + ex.getMessage());
			System.out.println("SQL State : " + ex.getSQLState());
			System.out.println("Vendor Error : " + ex.getErrorCode() );
		}
		sc.close();
	}
}
public class CrudOperations {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		char choice = 'n' ;
		int option = 0;
		do {
			System.out.println("********* CRUD OPERATIONS *********");
			System.out.println("\t1. ADD THE NEW PRODUCT");
			System.out.println("\t2. UPDATE THE NEW PRODUCT");
			System.out.println("\t3. DELETE THE NEW PRODUCT");
			System.out.print("\nENTER OPERATION TO PERFORM : ");
			option = input.nextInt();
		   
			switch (option) {
			case 1: {
				
				CRUD.addProduct();
				break ;
				
			}
			
			case 2 : {
				CRUD.updateProduct();
				break ;
			}
			
			case 3 :{
				CRUD.deleteProduct();
				break ;
			}
			default:
				System.out.println("INVALID CHOICE !!! CHOOSE AGAIN");
				break ;
				
			}
			System.out.print("\nDO YOU WANT TO CONTINUE (Y/N): ");
			choice = input.next().charAt(0);
			
		} 
		while(choice == 'y' || choice == 'Y');
		
		input.close();
		
	}

}
