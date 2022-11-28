package ObjectOrientedPrograming.Inheritance;

public class Dog extends Animal {

    //unique dog characterists
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //call the constructor from the Animal class with its respective fields by extending to it
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        //invoke super to acquire fields from parent class
        super(name, 1, 1, size, weight);

        //initialize fields relating to the Dog class:
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;

    }
    //Override method in the Animal class:
    //Command N and choose to overide
    @Override
    public void eat() {
        System.out.println("dog.eat() is called");
        //method unique to the dog class
        chew();
        //call the super equivalent, ie in Animal class and the eat() method, you don't have to do this step, just showing
        super.eat();
    }

    //Private method unique just for dogs:
    private void chew() {
        System.out.println("Dogs chew!");
    }

    public void walk() {
        System.out.println("dog.walk() has been called");
        super.move(1);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called..");
    }

    @Override
    public void move(int speed) {
        moveLegs(speed);
        super.move(speed);
    }

    public void run() {
        System.out.println("dog.run() has been called");
        move(5);
    }
}
