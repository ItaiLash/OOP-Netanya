package T3.Practice2;

public class Program {
	public static void main(String[] args) {
		Clown clown = new Clown("123", "Itzik", 5);
		LionTamar lionTamar = new LionTamar("456", "Baruch", 8);
		RopeWalker ropeWalker = new RopeWalker("789", "Hezi", 44, 4);
		FireSpitter fireSpitter = new FireSpitter("035", "Yoel", 5, 6);

		Circus circus = new Circus();
		circus.addEmployee(clown);
		circus.addEmployee(lionTamar);
		circus.addEmployee(ropeWalker);
		circus.addEmployee(fireSpitter);

		System.out.println("Total salary: " + circus.calculateTotalSalary());
		System.out.println("Clowns salary precent: " + circus.clownsSalaryPercent());
		System.out.println("Continue to next show: " + circus.noOfEmployeesForNextShow());
	}
}