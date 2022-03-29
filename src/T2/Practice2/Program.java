package T2.Practice2;

public class Program {

	public static void main(String[] args) {
		Lecturer l1 = new Lecturer("123", "Moshe");
		l1.addCourse("Java");
		l1.addCourse("C#");

		Lecturer l2 = new Lecturer("456", "Pinchas");
		l2.addCourse("Info 1");
		l2.addCourse("Info 2");

		Lecturer l3 = new Lecturer("789", "Sarit");
		l3.addCourse("Databases");
		l3.addCourse("Mathematics");

		Dean d = new Dean("135", "Dany");
		d.addCourse("Web");
		d.addLecturer(l1);
		d.addLecturer(l2);
		d.addLecturer(l3);

		d.show();
	}
}
