package Major_Review_Activities.Intermediate_Overview_OOP2.Polymorphism;

public class Lamborghini extends Car {

    private int doors;
    private int mph;
    private boolean tech;
    String hiMphBrake;

    public Lamborghini(String name, int cylinders, int doors, int mph, boolean tech) {
        super(name, cylinders);
        this.doors = doors;
        this.mph = mph;
        this.tech = tech;

    }
    @Override
    public String startEngine() {
        return "Sounds like an earthquake!";
    }

    @Override
    public String accelerate() {
        this.mph = 220;
        return "This car is actually going: " + this.mph + "! ";
    }
    @Override
    public String brake() {
        this.tech = true;
        this.hiMphBrake = "Emergency Tech Break!";
        return "The car is going too fast to stop we need to initialize: " + this.hiMphBrake;
    }
}