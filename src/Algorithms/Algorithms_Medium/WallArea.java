package Algorithms.Algorithms_Medium;

public class WallArea {

    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area = " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());
    }

    public static class Wall {
        private double width;
        private double height;


        public Wall() {
            this(0, 0);
        }

        public Wall(double width, double height) {
            if(width < 0) {
                this.width = 0;
            } else {
                this.width = width;
            }
            if(height < 0) {
                this.height = 0;
            } else {
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
}