## Speed Converter

#### 1. Write a method called **toMilesPerHour** that has 1 **parameter** of type **double** with the name **kilometersPerHour**. 
This method needs to return the rounded value of the calculation of type long.

If the parameter is less than 0, the method toMilesPerHour needs to return -1 to indicate an invalid value.

Otherwise, if it is positive, calculate the value of miles per hour, round and return it.

For conversion and rounding check below:

* toMilesPerHour(1.5) ---> should return value 1
* toMilesPerHour(10.25) ---> should return value 6
* toMilesPerHour(-5.6) ---> should return value -1
* toMilesPerHour(25.42) ---> should return value 16
* toMilesPerHour(75.114) ---> should return value 47



##### 2. Write another method called **printConversion** with 1 parameter of type double with the name
**kilometersPerHour**.

* This method, should not return anything(void) and it needs to calculate milesPerHour from KilometerPerHour parameter.

    - Then it needs to print a message in the format "XX km/h = YY mi/h"

        * XX is the original KilometerPer
        * YY is the rounded milesPer from the Kilometer param

If the parameter kilometersper < 0 then print "invalid value"