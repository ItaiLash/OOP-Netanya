package T3.Practice2;

public class FireSpitter extends CircusEmployee {
	private int _length;
	private int _no;

	public FireSpitter(String ID, String name, int length, int no) {
		super(ID, name);
		_length = length;
		_no = no;
	}

	public int calculateSalary() {
		return _length * _no * 30;
	}

	public boolean continueToNextShow() {
		return _length > 1;
	}
}
