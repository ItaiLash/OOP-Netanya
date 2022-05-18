package T6.Practice1;

public class Student {
	private String id;
	private String name;
	private Course[] courses;
	private int location;

	public Student(String id, String name) {
		this.id = id;
		this.name = name;
		this.courses = new Course[3];
	}

	public String getName() {
		return name;
	}

	public void addCourse(Course course) {
		try {
			courses[location++] = course;
		} catch (RuntimeException e) {
			Course[] arrNew = new Course[courses.length * 2];
			for (int i = 0; i < courses.length; i++)
				arrNew[i] = courses[i];
			courses = arrNew;
			courses[location++] = course;
			e.printStackTrace();
		}
	}

	public double calculateAverage() {
		try {
			int sum = 0;
			for (int i = 0; i < location; i++) {
				sum += courses[i].getGrade();
			}
			return sum / location;
		} catch (RuntimeException e) {
			e.printStackTrace();
			return 0;
		}
	}

	private Course findCourse(Course c) {
		for (int i = 0; i < location; i++)
			if (c.equals(courses[i]))
				try {
					return courses[i].clone();
				} catch (CloneNotSupportedException e) {
					e.printStackTrace();
				}
		return null;
	}

	public void findCourseAndPrint(Course c) {
		Course course = findCourse(c);
		System.out.println(course.toString());
	}
}
