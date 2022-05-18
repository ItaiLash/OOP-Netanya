package T5.Practice1;

import java.util.Arrays;

public class Lecturer implements Subscribable {
	private String name;
	private String degree;
	private String[] bookNames;
	private int location;
	

	public Lecturer(String name, String degree) {
		this.name = name;
		this.degree = degree;
		bookNames = new String[4];
	}

	@Override
	public boolean borrowBook(String bookName) {

		if (findBook(bookName) == -1 && location < bookNames.length) {
			bookNames[location++] = bookName;
			return true;
		}
		return false;
	}

	@Override
	public boolean returnBook(String bookName) {
		int n = findBook(bookName);
		if (n == -1)
			return false;

		for (int i = n; i < location; i++)
			bookNames[i] = bookNames[i + 1];
		location--;
		return true;
	}

	private int findBook(String bookName) {
		for (int i = 0; i < location; i++) {
			if (bookName.equals(bookNames[i]))
				return i;
		}
		return -1;
	}

	@Override
	public String toString() {
		return "Lecturer [name=" + name + ", degree=" + degree + ", bookNames=" + Arrays.toString(bookNames)
				+ ", location=" + location + "]";
	}

	@Override
	public Lecturer clone() throws CloneNotSupportedException {
		Lecturer lec = (Lecturer)super.clone();
		lec.bookNames = bookNames.clone();
		return lec;
		
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == this)
			return true;
		
		if(o == null)
			return false;
		
		if(o.getClass() != this.getClass())
			return false;
		
		Lecturer s = (Lecturer)o;
		
		return name.equals(s.name) && degree.equals(s.degree); 

	}
	

	

}
