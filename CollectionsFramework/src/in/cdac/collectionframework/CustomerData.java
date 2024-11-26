package in.cdac.collectionframework;import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

class Customer{
	int custId  ;
	String name , address ;
	Customer(int custId , String name , String address){
		this.custId = custId ;
		this.name = name ;
		this.address = address ;
	
	}
	
	// Display Customer Details
	void displayCustomerDetails(ArrayList<Customer> list) {
		System.out.println("Employee Details : \n");
		for (Customer c : list) {
			System.out.println("Customer Id :" +c.custId);
			System.out.println("Customer Name : " + c.name);
			System.out.println("Customer Address : " + c.address);
		}
	}
}

public class CustomerData {

	public static void main(String[] args) {
		Customer c1 = new Customer(101, "Rhaast", "New Delhi");
		Customer c2 = new Customer(102, "Chaotica", "Gurugram");
		Customer c3 = new Customer(103, "Dreamin", "Noida");
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		customerList.add(c1) ;
		customerList.add(c2) ;
		customerList.add(c3) ;
		
		c1.displayCustomerDetails(customerList);
	} 

}
