package T9.Practice;
import java.util.Iterator;

public class Program {

	public static void main(String[] args) {
		Student[] arr = new Student[3];
		arr[0] = new Student("Moshe", 50);
		arr[1] = new Student("Amonon", 67);
		arr[2] = new Student("Arik", 70);
		
		College c = new College(arr);
		
		Iterator<Student> it = c.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		
	}

}
