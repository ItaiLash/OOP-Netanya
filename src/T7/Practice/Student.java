package T7.Practice;

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

	public void addCourse(Course course) throws NoSpaceForCourseException {
		try {
			courses[location] = course;
			location++;
		} catch (RuntimeException re) {
			throw new NoSpaceForCourseException(re);
		}
	}

	public double calculateAvarage() throws NoCoursesForStudentException {
		try {
			int sum = 0;
			for (int i = 0; i < location; i++) {
				sum += courses[i].getGrade();
			}
			return sum / location;
		} catch (RuntimeException re) {
			throw new NoCoursesForStudentException();
		}
	}

	public Course findCourse(Course c) throws ObjectNotFoundException  {
		for (int i = 0; i < location; i++)
			if (c.equals(courses[i]))
				try {
					return courses[i].clone();
				} catch (CloneNotSupportedException e) {
					e.printStackTrace();
				}
		throw new ObjectNotFoundException("Course " + c.getName() + " doesnt exist for student " + name );
	}
}
