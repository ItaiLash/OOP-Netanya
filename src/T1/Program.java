package T1;

public class Program {

	public static void main(String[] args) {
		CollegeStudent cs = new CollegeStudent(86, "123456789");
		cs.updateWork(1, 60);
		cs.updateWork(2, 70);
		cs.updateWork(3, 80);
		cs.updateWork(4, 90);
		cs.updateWork(5, 100);
		
		System.out.println("Average: " + cs.computeAvg());
		
		cs.show();
	}

}
