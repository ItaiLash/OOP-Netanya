package T6.Practice1;

public class Program {

	public static void main(String[] args) {
		Student student = new Student("123", "Moshe");
		student.calculateAverage();

		Course c1 = new Course("Introduction To Java", 80);
		Course c2 = new Course("Advanced Java", 90);
		Course c3 = new Course("C Sharp", 70);
		Course c4 = new Course("Pyton", 74);

		student.addCourse(c1);
		student.addCourse(c2);
		student.addCourse(c3);
		student.addCourse(c4);

		Course courseToSearch = new Course("Math", 66);
		try {
			student.findCourseAndPrint(courseToSearch);
		} catch (RuntimeException re) {
			System.out.println("Couse " + courseToSearch.getName() + " doesnt exist for student " + student.getName());
		} finally {
			System.out.println(courseToSearch.toString());
		}

		try {
			Course courseClone = c1.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Class " + c1.getClass().getName() + " doesnt support cloning");

		}
	}

}
