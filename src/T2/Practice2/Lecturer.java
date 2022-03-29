package T2.Practice2;

public class Lecturer extends Employee {
	private String[] courses;
	private int numOfCourses;
	
	public Lecturer(String i, String n) {
		super(i, n);
		this.courses = new String[10];
		this.numOfCourses = 0;
		System.out.println("In Lecturer's constructor!");
	}
	
	public void addCourse(String courseName) {
		this.courses[this.numOfCourses] = courseName;
		this.numOfCourses ++;
	}

	public void show() {
		super.show();
		
		System.out.println("Courses list:");
		for(int i=0 ; i<this.numOfCourses ; i++) {
			System.out.println(this.courses[i]);
		}
	}
	
	
}
