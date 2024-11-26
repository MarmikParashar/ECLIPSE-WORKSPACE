package in.cdac.inheritance;

class AB
{
	int a = 10;											// Lastly executed
	AB()
	{
		System.out.println("Constructor of class AB"); // third Statement
	}
	private AB(int x)
	{
		System.out.println("Parameterized Constructor of class AB");
	}
	static												//First Executing this block because static
														//Static block will execute once in whole program cycle
	{
		System.out.println("class AB static block");
	}
	{
		System.out.println("Instance Block");			//Second Statement
	}
	static void show() {
		System.out.println("Static method of Class AB");
	}
	void display() {
		System.out.println("Display method of Class AB");
	}
	
}
public class StaticAndNonStaticBlock extends AB
{
	void display() {
		System.out.println("display method of StaticAndNonStatic Class");
		System.out.println("display method of StaticAndNonStatic Class");
	}
//	display show() {		// Child Class cannot override the static method of parent class
//		
//	}
	public static void main(String[] args) 
	{
		//create an object for class AB
		AB obj1 = new AB();
		//System.out.println(obj1.a);
		AB obj2 = new AB();
		obj1.display();	// calling the parent class display method
		StaticAndNonStaticBlock.show();
		StaticAndNonStaticBlock ss = new StaticAndNonStaticBlock();
		ss.display();	// this method of child class will override the display method of parent class
		
		AB obj3 = new StaticAndNonStaticBlock(); // up casting
		obj3.display();
		
//		StaticAndNonStaticBlock ss1 = (StaticAndNonStaticBlock)new AB(); // down casting 
//		ss1.display();
		
		
	}

}