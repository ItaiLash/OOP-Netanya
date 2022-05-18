package T5.Practice2;

public class Student implements Valuable {
	private String name;
	private String ID;
	private int grade;

	public Student(String name, String iD, int grade) {

		this.name = name;
		ID = iD;
		this.grade = grade;
	}

	@Override
	public int getValue() {

		return grade;
	}

	@Override
	public String toString() {
		return "T5.Practice2.Student [name=" + name + ", ID=" + ID + ", grade=" + grade + "]";
	}

}
