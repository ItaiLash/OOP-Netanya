package MoedA2019.Q3;

import java.util.List;

public class DailyDeliveries {
    private List<Delivery> deliveries;

    public Delivery findTheMostExpensiveDelivery() {
        Delivery maxDelivery = null;
        int maxCost = 0;
        int cost;

        for(Delivery delivery : deliveries) {
            cost = delivery.cost();
            if(cost > maxCost) {
                maxCost = cost;
                maxDelivery = delivery;
            }
        }
        return maxDelivery;
    }

}
