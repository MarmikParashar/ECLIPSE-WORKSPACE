package in.cdac.abstraction;
class BB {
	public void show() {
		System.out.println("Show Method of class BB");
	}
}
public class AA extends BB{
	public void display() {
		System.out.println("Display Method of Class AA");
	}
	public void show() {
		System.out.println("Show Method of Class AA");
	}

	public static void main(String[] args) {
		BB bb = new BB();
		bb.show();
		AA aa = new AA();
		aa.display();
		aa.show();
		
		BB obj = new AA();
		obj.show();
		
	}

}
