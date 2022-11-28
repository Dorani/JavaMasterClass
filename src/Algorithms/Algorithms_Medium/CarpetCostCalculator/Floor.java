package Algorithms.Algorithms_Medium.CarpetCostCalculator;

public class Floor {

    public static void main(String[] args) {
        Floor floor1 = new Floor(2,7);
        System.out.println(floor1.getLength());
        System.out.println(floor1.getWidth());
        System.out.println(floor1.getArea());
        floor1.setLength(3);
        floor1.setWidth(6);
        System.out.println("The new area is: " + floor1.getArea());

    }
    private double width;
    private double length;

    public Floor(double width, double length) {
        if(width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if(length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.length * this.width;
    }
}
