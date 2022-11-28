package Algorithms.Algorithms_Medium.CarpetCostCalculator;

public class Carpet {
    public static void main(String[] args) {
        Carpet persian = new Carpet(2222.34);
        System.out.println("The cost of the carpet is: " + persian.getCost());
    }

    private double cost;

    public Carpet(double cost) {
        if(cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return this.cost;
    }

}
