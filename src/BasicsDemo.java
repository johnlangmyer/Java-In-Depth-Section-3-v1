public class BasicsDemo {

    public static void primitives(){
        System.out.println("\n\nInside primitives...");
        int intHex = 0x0041;
        int intBinary = 0b0100_0001;
        int intOctal = 0101;
        System.out.println("intHex: " + intHex);
        System.out.println("intBinary: " + intBinary);
        System.out.println("intBinary: " + intOctal);

    }
    public static void main (String[] args){
        int i = 2;
        int j = 3;
        System.out.println( i + j );
        primitives();
    }
}
