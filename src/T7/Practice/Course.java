package T7.Practice;

public class Course implements Cloneable{
	private String name;
	private int grade;
	

	public Course(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", grade=" + grade + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (o == null)
			return false;

		if (this.getClass() != o.getClass())
			return false;

		Course c = (Course) o;
		if (name.equals(c.name))
			return true;

		return false;
	}

	@Override
	public Course clone() throws CloneNotSupportedException {
		return (Course) super.clone();
	}

}
