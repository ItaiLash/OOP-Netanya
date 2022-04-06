package T3.Practice1;

public class PatrolCop extends Cop {
	private String plateNumber;

	public PatrolCop(String name, String iD, int years, String pn) {
		super(name, iD, years);
		plateNumber = pn;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("Plate no: " + plateNumber);
	}
}
