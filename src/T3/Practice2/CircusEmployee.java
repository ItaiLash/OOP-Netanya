package T3.Practice2;

public abstract class CircusEmployee {
	private String _name;
	private String _ID;

	public CircusEmployee(String ID, String name) {
		_ID = ID;
		_name = name;
	}

	public abstract int calculateSalary();

	public abstract boolean continueToNextShow();
}