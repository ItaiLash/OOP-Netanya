package T1.materials_grp2;

import java.util.Arrays;

public class Manager extends Employee{
	
	private String[] employees;
	
	public Manager(String name, String id, int years, String dep, String[] emp, int bonus) {
		super(name,id,years,dep);
		this.employees = emp;
		super.setSalary(super.getSalary() + bonus);
	}
	
	public void show() {
		System.out.println("Manager:{"+super.getName()+", "+super.getSalary()+", "+super.getDepartment()+", "+Arrays.toString(this.employees)+"}");
	}
	
}
