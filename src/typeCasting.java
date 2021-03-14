public class typeCasting {

    static void typeCasting(){
        long y = 42;
        int x = (int) y;

        byte narrowedByte = (byte) 123456;
        System.out.println(narrowedByte);

        int iTruncated = (int) 1.99;
        System.out.println(iTruncated);

        y = x;

        byte bByte = 69;
        char cChar = (char) bByte;
        System.out.println(cChar);

    }
    public static void main(String[] args){
        typeCasting();
    }


}
