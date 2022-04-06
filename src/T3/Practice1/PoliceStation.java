package T3.Practice1;

public class PoliceStation {
	private Cop[] arr;
	private int location;

	public PoliceStation(int n) {
		arr = new Cop[n];
		location = 0;
	}

	public void addCop(Cop c) {
		arr[location] = c;
		location++;
	}

	public Cop searchCop(String name) {
		for (int i = 0; i < location; i++) {
			if (arr[i].getName().equals(name))
				return arr[i];
		}
		return null;
	}

	public void updateSeniority() {
		for (int i = 0; i < location; i++) {
			arr[i].updateSeniority();
		}
	}

	public Cop findMaxSalary() {
		Cop c = null;
		int maxSalary = 0;
		if (location > 0) {
			c = arr[0];
			maxSalary = c.calculateSalary();
		}
		for (int i = 1; i < location; i++) {
			if (arr[i].calculateSalary() > maxSalary) {
				c = arr[i];
				maxSalary = c.calculateSalary();
			}
		}
		return c;
	}
}
