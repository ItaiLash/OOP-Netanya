package T4.Practice;

public class FlowerStudent extends Student {
	private int classNo;
	private String school;

	public FlowerStudent(String name, String address, int classNo, String school) {
		super(name, address);
		this.classNo = classNo;
		this.school = school;
	}

	@Override
	public String toString() {
		return super.toString() + " Class no: " + classNo + " School: " + school;
	}

	@Override
	public boolean equals(Object o) {
		FlowerStudent fs;
		if (super.equals(o)) {
			fs = (FlowerStudent) o;
			if (classNo == fs.classNo && school.equals(fs.school)) {
				return true;
			}
		}
		return false;
	}

}
