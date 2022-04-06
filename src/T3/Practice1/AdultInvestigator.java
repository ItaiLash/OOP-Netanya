package T3.Practice1;

public class AdultInvestigator extends Investogator {
	
	public AdultInvestigator(String name, String iD, int years, String trainingPlace, String address) {
		super(name, iD, years, trainingPlace, address);
	}

	@Override
	public int calculateSalary() {
		return super.calculateSalary() + 800;
	}
	
}
