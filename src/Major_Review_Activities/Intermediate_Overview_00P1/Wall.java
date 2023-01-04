package Major_Review_Activities.Intermediate_Overview_00P1;

public class Wall {

    public static void main(String[] args) {
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }

    private double height;
    private double width;

    public Wall() {

    }

    public Wall(double width, double height) {
        if(width < 0) {
            this.width = 0;
        } else if(height < 0) {
            this.height = 0;
        } else {
            this.width = width;
            this.height = height;
        }
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        if(width >= 0) {
            this.width = width;
        } else {
            this.width = 0;
        }
    }

    public void setHeight(double height) {
        if(height >= 0) {
            this.height = height;
        } else {
            this.height = 0;
        }
    }

    public double getArea() {
        return this.width * this.height;
    }
}
