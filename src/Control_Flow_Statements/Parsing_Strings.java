package Control_Flow_Statements;

public class Parsing_Strings {
    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("Number as a string: " + numberAsString);

        //How can we convert this string into an integer
        //Use a class called Integer(wrapper class) for the primitive class int
        //It contains useful static methods like parseInt
        //Takes a param and returns an error if it's passed an invalid data type
        int number = Integer.parseInt(numberAsString);
        System.out.println(number);

        numberAsString += 1;
        number += 1;

        //What do we expect from above?
        System.out.println("number as string again... = " + numberAsString); //joining it to a string, since we can add
        System.out.println("number= " + number);//however once converted, we can easily increment by 1 and get a result

        //For the double data type:
        String doubleYear = "2018.125";
        double number2 = Double.parseDouble(doubleYear);
        System.out.println(number2);
    }
}

