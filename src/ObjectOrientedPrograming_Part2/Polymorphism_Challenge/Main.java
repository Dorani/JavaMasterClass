package ObjectOrientedPrograming_Part2.Polymorphism_Challenge;


// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generice car calss.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).


 class Car {
    private String name;
    private String model;
    private String color;
    private boolean engine;
    private int wheels;

    public Car(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
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
        return "Regular brake intialized";
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

}

class Benz extends Car {
     private boolean tintedWindows;
     private boolean surroundSound;
     private boolean tech;

    public Benz(String name, String model, String color, boolean tintedWindows, boolean surroundSound, boolean tech) {
        super(name, model, color);
        this.tintedWindows = tintedWindows;
        this.surroundSound = surroundSound;
        this.tech = tech;
    }

    @Override
    public String accelerate() {
        return "V-10 Benzi speeeeeeds!!";
    }
}

class Tesla extends Car {
     private boolean insaneMode;

    public Tesla(String name, String model, String color, boolean insaneMode) {
        super(name, model, color);
        this.insaneMode = false;
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() +  ": Electronic engine is smooth, but strong!";
    }

    @Override
    public String accelerate() {
        this.insaneMode = true;
        return getClass().getSimpleName() +  ": Accelerate TO INSANEEEE MODEEEEEE";
    }
}

class Audi extends Car {
    public Audi(String name, String model, String color) {
        super(name, model, color);
    }

    @Override
    public String startEngine() {
        return "Hello user welcome to your Audi";
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", "s-class", "red");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Tesla tesla = new Tesla("Hyper", "Model S", "blue", true);
        System.out.println(tesla.startEngine());
        System.out.println(tesla.accelerate());
        System.out.println(tesla.brake());


    }
}
