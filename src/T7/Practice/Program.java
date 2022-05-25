package T7.Practice;

public class Program {

	public static void main(String[] args) {

		Student student = new Student("123", "Moshe");
		try {
			student.calculateAvarage();
		} catch (NoCoursesForStudentException e1) {
			e1.printStackTrace();
		}

		Course c1 = new Course("Introduction To Java", 80);
		Course c2 = new Course("Advanced Java", 90);
		Course c3 = new Course("C Sharp", 70);
		Course c4 = new Course("Pyton", 74);

		try {
			student.addCourse(c1);
			student.addCourse(c2);
			student.addCourse(c3);
			student.addCourse(c4);
		} catch (NoSpaceForCourseException e1) {
			e1.getCause().printStackTrace();
		}

		Course courseToSearch = new Course("Math", 66);
		try {

			student.findCourse(courseToSearch);
		} catch (ObjectNotFoundException onfe) {
			System.out.println(onfe.getMessage());
		}

	}

}
