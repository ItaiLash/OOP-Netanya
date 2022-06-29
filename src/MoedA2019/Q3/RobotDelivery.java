package MoedA2019.Q3;

import java.util.List;

public class RobotDelivery extends Delivery {
    private int distance;
    private List<String> stopPoints;

    public RobotDelivery(int vehicleID, String source, String destination, int distance, List<String> stopPoints) {
        super(vehicleID, source, destination);
        this.distance = distance;
        this.stopPoints = stopPoints;
    }

    @Override
    public int cost() {
        return 15 * distance + 5 * stopPoints.size();
    }
}

