package Interfaces_InnerAbstractClasses.Abstract_Classes.Abstract_Intro;

//By creating abstract class with abtract methods
//We will inheret from this abstract class and it will let us define
//necessary behaviors without specifying how they should be performed


public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //We force the class inheriting this above class to create those methods for us
    //Which why they are abstract, because they need to be implemented
    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
