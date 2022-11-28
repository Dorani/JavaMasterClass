package Interfaces_InnerAbstractClasses.Abstract_Classes.Abstract_Intro;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    //leave it cause we want to implement functionlity
    @Override
    public void fly() {
        super.fly();
        System.out.println("I am not very good at that, can i go swim instead");
    }
}
