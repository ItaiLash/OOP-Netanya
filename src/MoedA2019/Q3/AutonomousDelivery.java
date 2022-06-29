package MoedA2019.Q3;

public class AutonomousDelivery extends Delivery {
    private int distance;
    private int time;

    public AutonomousDelivery(int vehicleID, String source, String dest, int distance, int time) {
        super(vehicleID, source, dest);
        this.distance = distance;
        this.time = time;
    }

    @Override
    public int cost() {
        return 8 * distance + 5 * time;
    }
}
