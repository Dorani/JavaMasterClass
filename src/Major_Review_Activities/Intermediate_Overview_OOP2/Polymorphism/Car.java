package Major_Review_Activities.Intermediate_Overview_OOP2.Polymorphism;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(String name, int cylinders) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        return "Regular Engine starting";
    }

    public String accelerate() {
        return "Regular car acceleration";
    }

    public String brake() {
        return "Regular brake initialized";
    }

    public int getCylinders() {
        return this.cylinders;
    }

    public String getName() {
        return this.name;
    }
}
