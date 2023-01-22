package Major_Review_Activities.Intermediate_Overview_OOP2.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Base car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println("--------------------------------------------------------------");


        Benz cls65 = new Benz("Cls - 65", 4, true, "S", 24);
        System.out.println(cls65.startEngine());
        System.out.println(cls65.accelerate());
        System.out.println(cls65.brake());
        System.out.println("--------------------------------------------------------------");

        Lamborghini lamborghini = new Lamborghini("Ghost", 12,2, 240, false);
        System.out.println(lamborghini.startEngine());
        System.out.println(lamborghini.accelerate());
        System.out.println(lamborghini.brake());
        System.out.println("--------------------------------------------------------------");


        Tesla modelS = new Tesla("S", 15, true, 320.234, 220, true);
        System.out.println(modelS.startEngine());
        System.out.println(modelS.accelerate());
        System.out.println(modelS.brake());
        System.out.println("--------------------------------------------------------------");


    }
}
