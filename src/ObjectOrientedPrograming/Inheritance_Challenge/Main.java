package ObjectOrientedPrograming.Inheritance_Challenge;

public class Main {
    public static void main(String[] args) {
        Outlander modelS = new Outlander(3);
        Car car = new Car("benz","3",3,3,3,true);
        Vehicle vehicle = new Vehicle("ferrari", "4");

        modelS.changeGear(5);
        car.changeVelocity(400, 4);
        vehicle.steer(4);
        modelS.accelerate(30);

    }
}
