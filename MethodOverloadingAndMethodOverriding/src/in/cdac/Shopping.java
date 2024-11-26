package in.cdac;

public class Shopping {
	public void addItem(String itemName) {
		System.out.println(itemName + " Added to the Cart ");
	}
	
	public void addItem(String itemName , int quantity) {
		System.out.println(itemName + " " +quantity + " added to cart ");
	}
	
	public void addItem(String itemName , int quantity , double price) {
		System.out.println(itemName +" " +quantity + " " + price +" added to cart ");
	}
	
	public static void main(String[] args) {
		Shopping sp = new Shopping();
		sp.addItem("Pen-Drive");
		sp.addItem("Mouse", 9);
		sp.addItem("Keyboard", 12, 1578.92);

	}

}
