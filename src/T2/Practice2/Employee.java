package T2.Practice2;

public class Employee {
	private String id;
	private String name;
	
	public Employee(String i, String n) {
		this.id = i;
		this.name = n;
		System.out.println("In Employee�s constructor!");
	}
	
	public void show() {
		System.out.println("ID: " + this.id);
		System.out.println("Name: " + this.name);
	}
}
