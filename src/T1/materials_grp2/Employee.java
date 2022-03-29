package T1.materials_grp2;

public class Employee {

	private String name;
	private String id;
	private int salary;
	private int yearsInCompany;
	private String department;
	
	public Employee(String name, String id, int years, String dep) {
		this.name = name;
		this.id = id;
		this.salary = 10000;
		this.yearsInCompany = years;
		this.department = dep;
	}
	
	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	protected void setSalary(int salary) {
		this.salary = salary;
	}

	public int getYearsInCompany() {
		return yearsInCompany;
	}

	public void setYearsInCompany(int yearsInCompany) {
		this.yearsInCompany = yearsInCompany;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void show() {
		System.out.println("Employee:{"+this.name+", "+this.salary+", "+this.department+"}");
	}
	
	
	
}
