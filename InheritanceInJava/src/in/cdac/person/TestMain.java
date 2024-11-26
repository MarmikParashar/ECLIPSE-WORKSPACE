package in.cdac.person;

public class TestMain {

	public static void main(String[] args) {
		Student s1 = new Student("Markile" , "New Delhi") ;
		System.out.println(s1);
		
		s1.addCourseGrade("JAVA", 90);
		s1.addCourseGrade("DBMS", 80);
		s1.addCourseGrade("Python", 90);
		double res = s1.CalculateAverage();
		System.out.println( "Average Marks of Markile :" +Math.round(res));
		
		Teacher t = new Teacher("John Falles", " Noida");
		System.out.println(t); 	// Calling toString Method
		
		String[] courses = {"JAVA","JAVA","Python"} ;
		for(String c : courses) {
			if(t.addCourse(c)) {
				System.out.println(c + " Added Successfully !");
			}
			else {
				System.out.println(c + " Already Exists !");
			}
		}
	}

}
