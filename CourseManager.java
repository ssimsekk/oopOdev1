package oopOdev1;

public class CourseManager {
	public void listCourseDetails(Course course) {
		System.out.println("Kurs Kodu: " + course.id);
		System.out.println("Kurs Ad�: " + course.courseName);
		System.out.println("Kurs Fiyat�: " + course.coursePrice);
		System.out.println("Kurs E�itmeni: " + course.lecturer);
	}
}
