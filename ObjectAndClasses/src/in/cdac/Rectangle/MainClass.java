package in.cdac.Rectangle;

//import in.cdac.Student.Students;

import in.cdac.Circle.*;

public class MainClass {

	public static void main(String[] args) {
		
		new Rectangles();
		
		Rectangles rec = new Rectangles();
		// Students std = new Students(); 
//		rec.Scan();
//		rec.CalculateArea();
		
		// Creating an object for the circle class
		Circle cr = new Circle() ;
		cr.RadiusOfCircle();
		cr.CalculateArea();
		cr.CalculateCircumference();
		
		// anonymous object
		
//		new Rectangles().Scan();
//		new Rectangles().CalculateArea() ;  Not working
		
		
	}
	
	
	

}
