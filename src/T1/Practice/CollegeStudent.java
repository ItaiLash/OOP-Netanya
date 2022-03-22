package T1.Practice;

public class CollegeStudent extends Student {
	private int testGrade;
	
	public CollegeStudent(int tg, String id) {
		super(id);
		this.testGrade = tg;
	}
	
	public double computeAvg(){
		double worksAvg = super.computeAvg();
		return (float)(0.8 * this.testGrade + 0.2 * worksAvg);
	}
	
	 public void show(){
		 super.show();
		 System.out.println("Test grade: " +  this.testGrade);
	 }

}
