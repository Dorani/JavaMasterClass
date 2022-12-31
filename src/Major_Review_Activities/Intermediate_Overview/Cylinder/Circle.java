package Major_Review_Activities.Intermediate_Overview.Cylinder;

public class Circle {

    private double radius;

    public Circle(double radius) {
        if(radius < 0) {
            radius = 0;
        }
        this.radius = radius;
    }

    public double getRadius() { return this.radius; }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
