import java.math.BigDecimal;

public class BasicsDemo {

    public static void primitives(){
        System.out.println("\n\nInside primitives...");
        int intHex = 0x0041;
        int intBinary = 0b0100_0001;
        int intOctal = 0101;

        char charInt = 65;
        char charHex = 0x0041;
        char charBinary = 0b0100_0001;


        System.out.println("intHex: " + intHex);
        System.out.println("intBinary: " + intBinary);
        System.out.println("intOctal: " + intOctal);
        System.out.println("charInt: " + charInt);
        System.out.println("charHex: " + charHex);
        System.out.println("charBinary: " + charBinary);

    }
    public static void main (String[] args){

        // int i = 2;
        // int j = 3;
        // System.out.println( i + j );
        primitives();

        System.out.println("\nDecimal examinations:");
        System.out.println(1-0.7); // floating point binary has trouble
        // 0.1 ~ 0.00110011001100110011.....

        double price = 1000;
        double discountPercent = 0.9;
        double discountAmount = price* discountPercent;
        System.out.println(discountAmount);
        System.out.println(1 - discountPercent);

        BigDecimal first = new BigDecimal("0.1");
        BigDecimal second = new BigDecimal("0.2");

        System.out.println(first.add(second)); // Use big decimal from math package - these are objects now, not numbers

    }
}
