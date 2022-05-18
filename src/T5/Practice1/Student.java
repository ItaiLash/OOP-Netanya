package T5.Practice1;

public class Student implements Subscribable {
	private String ID;
	private String name;
	private String bookName;
	
	public Student(String iD, String name) {
		ID = iD;
		this.name = name;
	}

	@Override
	public boolean borrowBook(String bookName) {
		if(this.bookName == null) {
			this.bookName = bookName;
			return true;
		}
		
		return false;
	}
	


	@Override
	public boolean returnBook(String bookName) {
		if(this.bookName.equals(bookName)) {
			this.bookName = null;
			return true;
		}
		
		return false;
	}

	@Override
	public Student clone() throws CloneNotSupportedException {
		return (Student)super.clone();
	}

	@Override
	public String toString() {
		return "Student [ID=" + ID + ", name=" + name + ", bookName=" + bookName + "]";
	}

	@Override
	public boolean equals(Object o) {
		if(o == this)
			return true;
		
		if(o == null)
			return false;
		
		if(o.getClass() != this.getClass())
			return false;
		
		Student s = (Student)o;
		
		return ID.equals(s.ID);
	}
	
	
}
