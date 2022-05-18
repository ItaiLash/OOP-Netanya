package T5.Practice2;

public class Employee implements Valuable {
	private String name;
	private int employeeNo;
	private int salary;
	
	public Employee(String name, int employeeNo, int salary) {
		super();
		this.name = name;
		this.employeeNo = employeeNo;
		this.salary = salary;
	}

	@Override
	public int getValue() {
		return salary;
	}

	
	@Override
	public String toString() {
		return "T5.Practice2.Employee [name=" + name + ", employeeNo=" + employeeNo + ", salary=" + salary + "]";
	}

	
	
}
