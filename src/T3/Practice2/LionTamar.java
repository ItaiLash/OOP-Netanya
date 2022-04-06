package T3.Practice2;

public class LionTamar extends CircusEmployee {
	private int _lionsNo;

	public LionTamar(String ID, String name, int lionsNo) {
		super(ID, name);
		_lionsNo = lionsNo;
	}

	public int calculateSalary() {
		return _lionsNo * 180;
	}

	public boolean continueToNextShow() {
		return _lionsNo > 3;
	}
}