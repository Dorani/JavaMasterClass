package Major_Review_Activities.Intermediate_Overview.CarpetCostCalculator;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        if(cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    public double getCost() {
        return this.cost;
    }
}
