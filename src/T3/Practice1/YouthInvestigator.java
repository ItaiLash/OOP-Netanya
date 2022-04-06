package T3.Practice1;

public class YouthInvestigator extends Investogator {
	private boolean specialCourse;

	public YouthInvestigator(String name, String iD, int years, String trainingPlace, String address,
			boolean specialCourse) {
		super(name, iD, years, trainingPlace, address);
		this.specialCourse = specialCourse;
	}

	@Override
	public void updateSeniority() {
		super.updateSeniority();
		if (specialCourse) {
			seniority = seniority + 1;
		}
	}

	@Override
	public int calculateSalary() {
		int salary = super.calculateSalary();
		if (specialCourse) {
			salary = salary + 700;
		}
		return salary;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("Special course: " + specialCourse);
	}
}
