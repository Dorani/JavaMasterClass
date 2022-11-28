package Interfaces_InnerAbstractClasses.Interfaces_Intro;

public interface ITelephone {
    //interface uses the word interface
    //define the methods used in this interface, that a class inside the interface needs to implement
    //signature: ie methods that form this interface
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callphone(int phoneNumber);
    boolean isRinging();
}
