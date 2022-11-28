package Interfaces_InnerAbstractClasses.Abstract_Classes.Abstract_Intro;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("breathe in and breathe out");
    }
}


