package T3.Practice1;

public class StationCommander extends Cop {
	private String rank;

	public StationCommander(String name, String iD, int years, String rank) {
		super(name, iD, years);
		this.rank = rank;
	}

	@Override
	public void updateSeniority() {
		seniority = seniority + 2;
	}

	@Override
	public void show() {
		super.show();

		System.out.println("Rank : " + rank);
	}
}
