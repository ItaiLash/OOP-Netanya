package T3.Practice2;

public class RopeWalker extends CircusEmployee {
	private int _shoesSize;
	private int _claps;

	public RopeWalker(String ID, String name, int shoesSize, int claps) {
		super(ID, name);
		_shoesSize = shoesSize;
		_claps = claps;
	}

	public int calculateSalary() {
		return _shoesSize * 150;
	}

	public boolean continueToNextShow() {
		return _claps > 0;
	}
}