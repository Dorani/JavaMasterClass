package Major_Review_Activities.Intermediate_Overview_OOP2.Composition;

public class Ceiling {

    private int height;
    private int paintedColor;

    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return this.height;
    }

    public int getPaintedColor() {
        return this.paintedColor;
    }
}
