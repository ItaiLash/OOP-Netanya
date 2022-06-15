import java.util.Iterator;

public class College implements Iterable<Student> {
	private Student[] arr;

	public College(Student[] arr) {
		this.arr = arr;
	}

	@Override
	public Iterator<Student> iterator() {
		return new StudentIterator(arr);
	}
}
