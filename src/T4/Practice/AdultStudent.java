package T4.Practice;

public class AdultStudent extends Student {
	private int yearOfBirth;

	public AdultStudent(String name, String address, int year) {
		super(name, address);
		this.yearOfBirth = year;
	}

	@Override
	public String toString() {
		return super.toString() + " Year of birth: " + yearOfBirth;
	}

	@Override
	public boolean equals(Object o) {
		AdultStudent as;
		if (super.equals(o)) {
			as = (AdultStudent) o;
			if (yearOfBirth == as.yearOfBirth) {
				return true;
			}
		}
		return false;
	}
}
