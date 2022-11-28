package MethodOverloading;

// Create a method called calcFeetAndInchesToCentimeters
// It needs to have two parameters.
// feet is the first parameter, inches is the 2nd parameter
//
// You should validate that the first parameter feet is >= 0
// You should validate that the 2nd parameter inches is >=0 and <=12
// return -1 from the method if either of the above is not true
//
// If the parameters are valid, then calculate how many centimetres
// comprise the feet and inches passed to this method and return
// that value.
//
// Create a 2nd method of the same name but with only one parameter
// inches is the parameter
// validate that its >=0
// return -1 if it is not true
// But if its valid, then calculate how many feet are in the inches
// and then here is the tricky part
// call the other overloaded method passing the correct feet and inches
// calculated so that it can calculate correctly.
// hints: Use double for your number datatypes is probably a good idea
// 1 inch = 2.54cm  and one foot = 12 inches
// use the link I give you to confirm your code is calculating correctly.
// Calling another overloaded method just requires you to use the
// right number of parameters.

public class MetricConverter {

    public static void main(String[] args) {
        double firstCalc = calcFeetAndInchesToCentimeters(6, 0);
        System.out.println(firstCalc);

        //validation of parameters when the method is invoked above
        if(firstCalc < 0.0) {
            System.out.println("invalid parameters");
        }

        double secondCalc = calcFeetAndInchesToCentimeters(100);
        System.out.println(secondCalc);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) && (inches >12))) {
            return -1;
        } else {
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
            return centimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0) {
            return -1;
        } else {
            //dividing the inches parameter by 12, whatever is left over will be put into our remaining inches
            double feet = (int) inches/12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
            //return and call the method at the same time
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
    }
}

                                    //METHOD OVERLOAD RECAP:
//It improves code readability and re-usability
//It is easier to remember one method name instead of remembering multiple names
//Achieves consistency in naming. One name for methods that are commonly used for example pintln(takes multiple data-types)
//Overloaded methods give programmers the flexibility to call a similar method with different types of data