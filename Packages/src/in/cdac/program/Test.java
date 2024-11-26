package in.cdac.program;

import in.cdac.*;
import in.cdac.pg.*;

public class Test {

	public static void main(String[] args) {
		in.cdac.Rectangle rec = new in.cdac.Rectangle();
		rec.area(); 
		rec.cal();
		
		in.cdac.pg.Rectangle r1 = new in.cdac.pg.Rectangle();
		r1.Area();
		
		Circle c = new Circle(10.5f);
	
	}

}
