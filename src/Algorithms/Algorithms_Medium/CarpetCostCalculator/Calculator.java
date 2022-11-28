package Algorithms.Algorithms_Medium.CarpetCostCalculator;


public class Calculator {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());

    }
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public void setCarpet(Carpet carpet) {
        this.carpet = carpet;
    }

    public double getTotalCost() {
        double area = floor.getArea();
        return (area * this.carpet.getCost());
    }
}
