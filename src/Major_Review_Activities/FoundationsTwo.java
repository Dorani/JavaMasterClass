package Major_Review_Activities;

public class FoundationsTwo {
    public static void main(String[] args) {
        //First example:
        //Working with formulas and overloading methods
        //Ie: same method name, different parameters, diff body of functionality
        System.out.println("First example - Area Calculation:");
        double areaOfCircle = area(5.0);
        System.out.println("The area of the circle is: " + areaOfCircle);
        double areaOfRectangle = area(5,5);
        System.out.println("The area of the rectangle is: " + areaOfRectangle);
        System.out.println("---------------------------------------------------");

        //Second example:
        //Working with equality formulas

    }
    //Test on data types, conditionals, and double typed functions
    public static double area(double radius) {
        if(radius < 0) {
            return -1;
        }
        double area = (radius * radius) * Math.PI;
        return area;
    }
    //Test on data types, conditionals, and double typed Overloaded functions
    public static double area(double length, double width) {
        if(length < 0 || width < 0) {
            return -1;
        }
        double area = length * width;
        return area;
    }
}
