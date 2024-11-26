package in.cdac.person;

public class Student extends Person{
	private int numCourses ;
	private String[] courses ;
	private int[] marks ;
	private final int MAX_COURSES = 5 ;		// Constant variable
	private double sum = 0.0 ;
	Student(String name , String address){
		super(name , address);			// Calling the super class constructor
		numCourses = 0 ;
		courses = new String[MAX_COURSES];
		marks = new int[MAX_COURSES];
	
	}
	@Override
	public String toString() { 		// the method name should be same for overriding
		return "Student Info : \n " + super.toString() ;
	}
	
	public void addCourseGrade(String course , int mark) {
		courses[numCourses] = course ;
		marks[numCourses] = mark ;
		++numCourses ;
	}
	
	//Print all marks and courses
	public void printCourseMarks() {
		for(int i = 0 ; i < numCourses ; i++) {
			System.out.println(courses[i] + " \t" + marks[i]);
		}
		
	}
	
	// average marks
	public double CalculateAverage() {
		for (int i = 0; i < numCourses ; i++) {
			sum += marks[i];
			}
		return sum/numCourses ;
		}
	
}
