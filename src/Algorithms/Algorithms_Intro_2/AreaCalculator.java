package Algorithms.Algorithms_Intro_2;

public class AreaCalculator {

    public static final double NEGATIVE_VALUE = -1;
    public static void main(String[] args) {
        double areaOfCircle = area(5.0);
        System.out.println(areaOfCircle);

        double areaOfCircle2 = area(-1);
        System.out.println(areaOfCircle2);

        double areaOfRectangle1 = area(5.0, 4.0);
        System.out.println(areaOfRectangle1);

        double areaOfRectangle2 = area(-1.0, 4.0);
        System.out.println(areaOfRectangle2);
    }

    public static double area(double radius) {
        if(radius < 0) {
            return NEGATIVE_VALUE;
        }
        double area = (radius * radius) * Math.PI;
        return area;
    }

    public static double area(double x, double y) {
        if(x < 0 || y < 0) {
            return NEGATIVE_VALUE;
        }
        double area = x * y;
        return area;
    }
}
