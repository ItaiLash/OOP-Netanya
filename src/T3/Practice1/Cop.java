package T3.Practice1;

public class Cop {
	private String name;
	private String ID;
	protected int seniority;

	public Cop(String name, String iD, int years) {
		this.name = name;
		ID = iD;
		this.seniority = years;
	}
	public String getName() {
		return name;
	}

	public void updateSeniority() {
		seniority = seniority + 1;
	}

	public int calculateSalary() {
		return 5000 + seniority * 1000;
	}

	public void show() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + ID);
		System.out.println("Senurity: " + seniority);
		System.out.println("Salary: " + calculateSalary());
	}
}
