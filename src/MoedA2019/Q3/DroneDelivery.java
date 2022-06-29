package MoedA2019.Q3;

public class DroneDelivery extends Delivery {
    private int time;

    public DroneDelivery(int vehicleID, String source, String destination,int time) {
        super(vehicleID, source, destination);
        this.time = time;
    }

    @Override
    public int cost() {
        return 10 * time;
    }
}
