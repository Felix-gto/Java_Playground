package Basics;

public class Variables {
    public static void main(String[] args) {
        // VARIABLES - PRIMITIVE TYPES

        //Integers = whole numbers
        System.out.println("\nINTEGERS");
        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;

        System.out.println("Min int value is: " + minIntValue);
        System.out.println("Max int value is: " + maxIntValue);

        //Bytes
        System.out.println("\nBYTES");
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        byte myByteValue = 36;

        System.out.println("Min byte value is: " + minByteValue);
        System.out.println("Max byte value is: " + maxByteValue);
        System.out.println("Felix's byte value is: " + myByteValue);

        //Short
        System.out.println("\nSHORT");
        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;

        System.out.println("Min short value is: " + minShortValue);
        System.out.println("Max short value is: " + maxShortValue);

        //Long
        System.out.println("\nLONG");
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        long myLongNumber = 9999999999L;

        System.out.println("Min long value is: " + minLongValue);
        System.out.println("Max long value is: " + maxLongValue);
        System.out.println("My long value is: " + myLongNumber);

        //Float
        System.out.println("\nFLOAT");
        float myFloatNumber = 36.55F;
        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;

        System.out.println("Felix's float number is: " + myFloatNumber);
        System.out.println("Min float value is: " + minFloatValue);
        System.out.println("Max float value is: " + maxFloatValue);

        //Double
        System.out.println("\nDOUBLE");
        double myDoubleNumber = 36.55D;
        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;

        System.out.println("Felix's double number is: " + myDoubleNumber);
        System.out.println("Min double value is: " + minDoubleValue);
        System.out.println("Max double value is: " + maxDoubleValue);

        //Char
        System.out.println("\nCHAR");
        char myInitial = 'F';
        System.out.println("My firstname's initial is: " + myInitial);

        //Boolean
        System.out.println("\nBOOLEAN");
        boolean isFelixSmart = true;
        System.out.println("Felix is smart. -> The statement is: " + isFelixSmart);
    }

}
