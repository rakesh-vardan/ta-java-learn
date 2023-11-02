package com.learn;

public class PrimitiveDataTypes {

    public static void main(String[] args) {
        /**
         * boolean:
         * - used to store only 2 possible values --> true/false
         * - size is 1 bit
         */

        boolean flag = true;
        boolean flag1 = false;
//        boolean flag2 = 0;
        System.out.println("Output for variable flag is: " + flag); //true
        System.out.println("Output for variable flag1 is: " + flag1); //false


        /**
         * byte:
         *  --> 8-bit signed 2's complement integer
         *  --> can hold values from -128 (-2^7) to 127 (2^7 - 1)
         *  --> default is 0
         */
        byte value = 10;
        byte value2 = -20;
        System.out.println("Variable value is: " + value);
        System.out.println("Variable value2 is: " + value2);

        /**
         * short:
         *  --> 16-bit signed 2's complement integer
         *  --> can hold values from -32768 (-2^15) to 32767 (2^15 - 1)
         *  --> default is 0
         */
        short shortVariable = 3458;
        short shortVariable1 = -2087;
        System.out.println("Variable shortVariable is: " + shortVariable);
        System.out.println("Variable shortVariable1 is: " + shortVariable1);

        /**
         * int:
         *  --> 32-bit signed 2's complement integer
         *  --> can hold values from -2147483648 (-2^31) to 2147483647 (2^31 - 1)
         *  --> default is 0
         */
        int intVariable = 34588867;
        int intVariable1 = -2087878;
        System.out.println("Variable intVariable is: " + intVariable);
        System.out.println("Variable intVariable1 is: " + intVariable1);

        /**
         * long:
         *  --> 64-bit signed 2's complement integer
         *  --> can hold values from -9223372036854775808 (-2^63) to 9223372036854775807 (2^63 - 1)
         *  --> default is 0L
         */
        long longVariable = 34588867L;
        long longVariable1 = -2087878L;
        System.out.println("Variable longVariable is: " + longVariable);
        System.out.println("Variable longVariable1 is: " + longVariable1);

        /**
         * float:
         * --> 32-bit single floating point numbers
         * --> default value is 0.0f
         */
        float floatVariable = 234.45f;
        float floatVariable1 = -234.45f;
        System.out.println("Variable floatVariable is: "+ floatVariable);
        System.out.println("Variable floatVariable1 is: "+ floatVariable1);

        /**
         * double:
         * --> 64-bit single floating point numbers
         * --> default value is 0.0d
         */
        double doubleVariable = 23346463464.45d;
        double doubleVariable1 = -2346347347.45d;
        System.out.println("Variable doubleVariable is: "+ doubleVariable);
        System.out.println("Variable doubleVariable1 is: "+ doubleVariable1);

        /**
         * char:
         * --> 16-bit unicode characters
         * --> range is from '\u0000' (0) to '\uffff' (65535)
         * --> used to store character values
         */
        char charVariable = 'a';
        char charVariable1 = '2';
        System.out.println("Variable charVariable is: " + charVariable);
        System.out.println("Variable charVariable1 is: " + charVariable1);
    }

}
