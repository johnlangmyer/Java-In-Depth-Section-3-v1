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

    /*

    CAN BE DONE AT AT CLASS LEVEL:

    Field declarations
    Method declarations
    Constructor declarations
    Nested Class & interface declarations
    Instance and static initializers

    */

    static int count = 25;
    static int[] scores;

    static void arrays(){
        System.out.println("\nInside arrays ...");
        scores = new int[4];
        scores[0] = 90;
        scores[1] = 70;
        scores[2] = 80;
        scores[3] = 100;



//        int[] scores = {1,2,3,4};
//        int[] scores = {1,2,3,4};



        System.out.println("Midterm 1: " + scores[0]);
        System.out.println("Midterm 2: " + scores[1]);
        System.out.println("Final: " + scores[2]);
        System.out.println("Project:  " + scores[3]);
        System.out.println("# of Grades: " + scores.length);

//        Student[] students = new Student[] {new Student(), new Student(), new Student()};
//        students[0] = new Student();
//        students[1] = new Student();
//        students[2] = new Student();
//
//        students[0].name = "John";
//        students[1].name = "Raj";
//        students[2].name = "Anita";
//        System.out.println("Student 1: " + students[0].name);
//        System.out.println("Student 2: " + students[1].name);
//        System.out.println("Student 3: " + students[2].name);



    }

    static double sum(double x, double y){
        return x + y;
    }
    static double avg(double x, double y){
        double sum = sum(x, y);
        return sum/2;
    }

    static boolean search(int[] list, int key){
        for (int i : list) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }

    static void go(int[] array){
        System.out.println("Array[0]: " + array[0]);
        System.out.println("Array[1]: " + array[1]);
        array[1] = 22;
    }
    static void go(int i){
        System.out.println("go (int i)");

    }
    static void go(short s){
        System.out.println("go (short s)");
    }
    static void varargsOverload(boolean b, int... list){
        System.out.println("\nInside varargsOverload...");
        System.out.println("list.length: " + list.length);

    }



    public static void main (String[] args) {

//        int i = 2;
//        int j = 3;
//        System.out.println( i + j );
//        primitives();
//
//        System.out.println("\nDecimal examinations:");
//        System.out.println(1-0.7); // floating point binary has trouble
//        0.1 ~ 0.00110011001100110011.....
//
//        double price = 1000;
//        double discountPercent = 0.9;
//        double discountAmount = price* discountPercent;
//        System.out.println(discountAmount);
//        System.out.println(1 - discountPercent);
//
//        BigDecimal first = new BigDecimal("0.1");
//        BigDecimal second = new BigDecimal("0.2");
//
//        System.out.println(first.add(second)); // Use big decimal from math package - these are objects now, not numbers

//        arrays();
//        float d = (float) sum(3.0f,(float) 2.0);
//        System.out.println(d);
//
//        double d2 = avg(3.0,2.0);
//        System.out.println(d2);
//
//        int[] list = {1, 2, 3};
//
//        System.out.println(search(list, 4));
//        int[] array = {1,2};
//        go(array);
//        System.out.println("Array[1]: " + array[1]);
//        go(1000);
//        byte b = 22;
//        go(b);
        varargsOverload(true, 1, 2, 3);
        varargsOverload(true, 1, 2, 3, 4, 5, 6);
        varargsOverload(true);




    }
}
