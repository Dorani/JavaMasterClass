package Major_Review_Activities.Intermediate_Overview_OOP2.Polymorphism;

public class Benz extends Car {
    private boolean tints;
    private String model;
    private int rimSize;
    private boolean tech;

    public Benz(String name, int cylinders, boolean tints, String model, int rimSize) {
        super(name, cylinders);
        this.tints = tints;
        this.model = model;
        this.rimSize = rimSize;
        this.tech = false;
    }

    @Override public String startEngine() {
        return "V8 ENGINE!";
    }

    @Override public String accelerate() {
        return "0-60 in 3 seconds";
    }

    @Override public String brake() {
        return "V-8 engine break initialized";
    }

}

