package Major_Review_Activities.Intermediate_Overview.Pool_Area;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double width, double length) {
        if (length < 0) {
            length = 0;
        }
        this.length = length;
        if (width < 0) {
            width = 0;
        }
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double getArea() {
        return this.length * this.width;
    }
}
