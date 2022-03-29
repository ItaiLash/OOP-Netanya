package T1.materials_grp1;

public class CollegeStudent extends Student {
	int testGrade;
	
	public CollegeStudent(String id, int grade) {
		super(id);
		this.testGrade = grade;
	}
	
	@Override
    public double computeAvg() {
    	return (this.testGrade*0.8) + (super.computeAvg()*0.2);
    }
	
	@Override
	 public void show() {
        System.out.println("Test grade: " + this.testGrade);;
	}
}

