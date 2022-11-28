package Fundamentals_Foundations.Operators;

public class Operand {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println(result);

        int previousResult = result;
        System.out.println(previousResult);
        //multiply
        result = result * 10;
        System.out.println(result);
        //division
        result = result / 5;
        System.out.println(result);
        //modulus, 6 % 5 = should return 1
        result = result % 5;
        System.out.println("remainder is " + result);

        //result = result + 1
        result++;
        System.out.println("1 + 1 = "+ result);

        //result = result - 1
        result--;
        System.out.println("2 - 1 = " + result);

        //result = result + 2
        result += 2;
        System.out.println(result);

        //result = result * 10 = should equal 30
        result *= 10;
        System.out.println(result);

        //result = result / 3
        result /= 3;
        System.out.println(result);

        //result = result - 2
        result -= 2;
        System.out.println(result);
    }
}
