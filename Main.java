package oopOdev1;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "C#", 4999, "S�leyman ��M�EK");

		Course course2 = new Course(2, "Python", 6499, "Melis ��M�EK");

		Course course3 = new Course(3, "Programlamaya Giri�", 1199, "S�leyman ��M�EK");

		Course[] courses = { course1, course2, course3 };

		System.out.println("Toplam Kurs Say�s�: " + courses.length);

		CourseManager courseManager = new CourseManager();

		for (Course course : courses) {
			courseManager.listCourseDetails(course);
			System.out.println("------------------------------");
		}

		Lecturer lecturer1 = new Lecturer(1, "S�leyman", "��M�EK");

		Lecturer lecturer2 = new Lecturer(2, "Melis", "��M�EK");

		Lecturer[] lecturers = { lecturer1, lecturer2 };

		System.out.println("Toplam e�itmen say�s�: " + lecturers.length);

		LecturerManager lecturerManager = new LecturerManager();

		for (Lecturer lecturer : lecturers) {
			lecturerManager.listLecturerDetails(lecturer);
			System.out.println("------------------------------");
		}

	}

}
