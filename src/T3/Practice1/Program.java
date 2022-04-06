package T3.Practice1;

public class Program {

	public static void main(String[] args) {
		PoliceStation ps = new PoliceStation(4);

		ps.addCop(new AdultInvestigator("Moshe Arzi", "1234", 1, "Tel Aviv", "28 Jabotinsky Petah Tikva"));
		ps.addCop(new PatrolCop("Yossi Cohen", "456", 2, "33333"));
		ps.addCop(new StationCommander("Shalom Baruch", "567", 12, "Captain"));
		ps.addCop(new YouthInvestigator("Avi Levi", "789", 5, "Holon", "28 Halia Natania", true));

		ps.updateSeniority();

		Cop c = ps.searchCop("Moshe Arzi");
		if (c != null)
			c.show();

		c = ps.findMaxSalary();
		if (c != null)
			c.show();

	}

}
