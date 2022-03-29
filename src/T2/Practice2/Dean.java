package T2.Practice2;

public class Dean extends Lecturer {
	private Lecturer[] lecturers;
	private int numOfLecturers;

	public Dean(String i, String n) {
		super(i, n);

		this.lecturers = new Lecturer[10];
		this.numOfLecturers = 0;
		System.out.println("In Dean's constructor!");
	}

	public void addLecturer(Lecturer l) {
		this.lecturers[this.numOfLecturers] = l;
		this.numOfLecturers++;
	}

	public void show() {
		super.show();
		
		System.out.println("Lecturers:");
		for (int i = 0; i < this.numOfLecturers; i++) {
			this.lecturers[i].show();
		}
	}

}
