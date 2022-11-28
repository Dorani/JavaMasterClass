package Interfaces_InnerAbstractClasses.Interfaces_Intro;

public class Main {
    public static void main(String[] args) {
        ITelephone seifsPhone;
        seifsPhone = new DeskPhone(12345);
        seifsPhone.powerOn();
        seifsPhone.callphone(1234213);
        seifsPhone.answer();


        //-----//

        seifsPhone = new MobilePhone(121232);
        seifsPhone.powerOn();
        seifsPhone.callphone(123434);
        seifsPhone.answer();
    }
}
