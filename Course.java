package oopOdev1;

public class Course {
	public Course(int id, String courseName, double coursePrice, String lecturer) {
		this.id  = id;
		this.courseName = courseName;
		this.coursePrice = coursePrice;
		this.lecturer = lecturer;
		System.out.println("Kurs oluþturuldu.");
	}
	
	int id;
	String courseName;
	double coursePrice;
	String lecturer;
}
