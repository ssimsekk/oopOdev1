package oopOdev1;

public class CourseManager {
	public void listCourseDetails(Course course) {
		System.out.println("Kurs Kodu: " + course.id);
		System.out.println("Kurs Adý: " + course.courseName);
		System.out.println("Kurs Fiyatý: " + course.coursePrice);
		System.out.println("Kurs Eðitmeni: " + course.lecturer);
	}
}
