package T3.Practice2;

public class Clown extends CircusEmployee {
	private int _laughed;

	public Clown(String ID, String name, int laughed){
		super(ID, name);
		_laughed = laughed;
	}

	public int calculateSalary() {
		return _laughed * 100;
	}

	public boolean continueToNextShow() {
		return _laughed > 0;
	}
}