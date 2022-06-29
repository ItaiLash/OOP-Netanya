package MoedA2019.Q3;

public abstract class Delivery {
    private int vehicleID;
    private String source, destination;

    public Delivery(int vehicleID, String source, String destination){
        this.vehicleID = vehicleID;
        this.source = source;
        this.destination = destination;
    }

    public abstract int cost();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Delivery other = (Delivery) obj;
        if(this.vehicleID == other.vehicleID &&
                this.source.equals(other.source) &&
                this.destination.equals(other.destination))	return true;

        return false;
    }
}

