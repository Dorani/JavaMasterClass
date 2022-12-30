package Major_Review_Activities.Intermediate_Overview;

public class Point {

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }

    private int x;
    private int y;

    public Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
       return (double) Math.sqrt(Math.pow((this.x), 2)
               + Math.pow((this.y), 2));
    }

    public double distance(int x, int y) {
        return (double) Math.sqrt(Math.pow((x - this.x), 2)
                + Math.pow((y - this.y), 2));
    }

    public double distance(Point secondPoint) {
        return (double) Math.sqrt(Math.pow((secondPoint.x - this.x), 2)
                + Math.pow((secondPoint.y - this.y), 2));
    }
}
