package ObjectOrientedPrograming.Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1,1,5,5);

        Dog dog = new Dog("Pom", 8, 29,2,4,1,20, "lion cut");
        //Inheritance from our Animal class, since its publicly accessible and since we have extending to it:
        dog.eat();
        dog.walk();
        dog.run();

    }
}
