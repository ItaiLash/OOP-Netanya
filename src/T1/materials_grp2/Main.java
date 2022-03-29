package T1.materials_grp2;


public class Main {

	public static void main(String[] args) {
		Employee e = new Employee("Yossi","111",4,"R&D");
		String[] emp = {"111"};
		Manager m = new Manager("Avi","222",8,"R&D",emp,4000);
		e.show();
		m.show();
	}

}
