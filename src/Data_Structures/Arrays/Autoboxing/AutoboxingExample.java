package Data_Structures.Arrays.Autoboxing;

import java.util.ArrayList;

public class AutoboxingExample {

    static class IntClass {
        private int myValue;

        public IntClass(int myValue) {
            this.myValue = myValue;
        }

        public int getMyValue() {
            return myValue;
        }

        public void setMyValue(int myValue) {
            this.myValue = myValue;
        }
    }

    public static class Main {

        public static void main(String[] args) {
//            String[] strArray = new String[10];
//            int[] intArray = new int[10];
//
//            ArrayList<String> strArrayList = new ArrayList<String>();
//            strArrayList.add("Tim");
//
////        ArrayList<int> intArrayList = new ArrayList<int>();
//            ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
////            intClassArrayList.add(new IntClass(54));
////            Integer integer = new Integer(54);
////            Double doubleValue = new Double(12.25);
//
//
//            //Autoboxing
//            ArrayList<Integer> intArrayList = new ArrayList<Integer>();
//            for(int i=0; i<=10; i++) {
//                //autoboxing example: converting an int type, to an Integer class
//                intArrayList.add(Integer.valueOf(i));
//            }
//            for(int i=0; i<=10; i++) {
//                System.out.println(i + " --> " + intArrayList.get(i).intValue());
//            }
//
//            //Help, short cut - the commented out is what will happen at compile time
//            Integer myIntValue = 56; // Integer.valueOf(56);
//            int myInt = myIntValue.intValue(); // myIntValue.intValue();


            //---------------------------------------------------//
                                //Autoboxing and Unboxing with replaced shortcuts.

            //Create an array list of unique double values
            ArrayList<Double> myDoubleValues = new ArrayList<Double>();
            for(double dbl=0.0; dbl<=10.0; dbl += 0.5) {

                //Shortcut autoboxing
                //myDoubleValues.add(Double.valueOf(dbl);
                myDoubleValues.add(dbl);
            }
            for(int i=0; i<myDoubleValues.size(); i++) {
                //Shortcut Unboxing:
                //double value = myDoubleValues.get(i).doubleValue();
                double value = myDoubleValues.get(i);
                System.out.println(i + "  --> " + value);
            }
        }
    }
}
