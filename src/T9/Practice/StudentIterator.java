package T9.Practice;
import java.util.Iterator;

public class StudentIterator implements Iterator<Student> {
	private Student[] arr; // assume that array is full
	private int index;

	public StudentIterator(Student[] arr) {
		this.arr = arr;

		forward();

	}

	@Override
	public boolean hasNext() {
		return index < arr.length;
	}

	@Override
	public Student next() {
		Student s = arr[index]; // return current student
		index++;

		forward();

		return s;
	}
	
	private void forward() {
		// find the next student with grade > 59
		while (index < arr.length && arr[index].getGrade() < 60)
			index++;
	}

}
