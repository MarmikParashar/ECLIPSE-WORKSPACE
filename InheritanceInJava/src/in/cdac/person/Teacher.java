package in.cdac.person;

public class Teacher extends Person {
	private int numCourses;
	private String[] courses;
	private final int  MAX_COURSES = 5 ; 	// Constant
	
	Teacher(String name , String address){
		super(name , address) ;
		numCourses = 0 ;
		courses = new String[MAX_COURSES] ;
	}
	
	@Override
	public String toString() { 		// the method name should be same for overriding
		return "Teachers Info : \n " + super.toString() ;
	}
	
	public boolean addCourse(String course) {
		for (int i = 0; i < numCourses ; i++) {
			if(courses[i].equals(course)) {
				return false ;
			}	
		}
		courses[numCourses] = course ;
		numCourses++ ;
		return true ;
	}
	
	
	
}
