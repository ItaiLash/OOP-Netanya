package T4.Practice;

public class Course {
	private String name;
	private String lecturerName;
	private Student[] students;
	private int index;

	public Course(String n, String ln, int noOfStudents) {
		name = n;
		lecturerName = ln;
		students = new Student[noOfStudents];
		index = 0;
	}

	public boolean register(Student s) {
		if (index < students.length && !isRegistered(s)) {
			students[index++] = s;
			return true;
		}
		return false;
	}

	public boolean isRegistered(Student s) {
		for (int i = 0; i < index; i++) {
			if (students[i].equals(s)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String courseDetails = "Name: " + name + " Lecturer name: " + lecturerName;
		String studentsDetails = "";
		for (int i = 0; i < index; i++) {
			studentsDetails += students[i].toString() + "\n";
		}
		return courseDetails + "\n" + studentsDetails;
	}

	public int countAdultStudents() {
		int noOfAdultStudents = 0;
		for (int i = 0; i < index; i++){
			if (students[i].getClass() == AdultStudent.class) {
				noOfAdultStudents++;
			}
		}
		return noOfAdultStudents;
	}
}
