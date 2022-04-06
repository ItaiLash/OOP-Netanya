package T4.Practice;

import java.util.Objects;

public class Student {
	protected String name;
	protected String address;

	public Student(String name, String address) {
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Name: " + name + " Address: " + address;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || this.getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return this.name.equals(student.name) && this.address.equals(student.address);
	}

}
