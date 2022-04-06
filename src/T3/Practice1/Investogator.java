package T3.Practice1;

public class Investogator extends Cop {
	private String trainingPlace;
	private String address;

	public Investogator(String name, String iD, int years, String trainingPlace, String address) {
		super(name, iD, years);
		this.trainingPlace = trainingPlace;
		this.address = address;
	}

	@Override
	public int calculateSalary() {
		return 3000 + seniority * 500;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("Training place: " + trainingPlace);
		System.out.println("Address: " + address);
	}

}
