package Major_Review_Activities.Intermediate_Overview_OOP2.Polymorphism;

public class Tesla extends Car {
    private boolean AI;
    private double EV;
    private int speed;
    private boolean selfDriving;
    private boolean tech;

    public Tesla(String name, int cylinders,  boolean AI, double EV, int speed, boolean selfDriving) {
       super(name,cylinders);
       this.AI = true;
       this.EV = EV;
       this.speed = speed;
       this.selfDriving = selfDriving;
       this.tech = true;
    }

    @Override public String startEngine() {
        this.EV = 390;
        return "Car initialized, there is " + this.EV + " remaining electricity";
    }

    @Override public String accelerate() {
        this.speed = 210;
        return "Hitting a smooth " + this.speed + " total speed in an EV car!?";
    }

    @Override public String brake() {
        if (this.tech) {
            this.AI = true;
            this.selfDriving = true;
            System.out.println("Tech is activated");
        }
        return "Car is self driving, and self parking!?";
    }
}
