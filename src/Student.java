public class Student {
    int id = 1000;
    String name;
    String gender;

    byte age = 18;
    byte rank = 127; // -128 to +128
    long phone = 223_456_7890L; // Java 7 onwards for readability

    // Integer literals: int literal, long literal

    int minValue = Integer.MIN_VALUE;
    int maxValue = Integer.MAX_VALUE;

    void compute(){

        int nextID = id + 1;
        System.out.println("id: " + id);
        System.out.println("Next id: " + nextID);
        System.out.println("age: " +  age);
        System.out.println("Rank: " + rank);
        System.out.println("Phone: " + phone);
        System.out.println(minValue);
        System.out.println(maxValue);
    }

    boolean updateProfile(String newName){
        name = newName;
        return true;
    }

    public static void main(String[] args){
        Student s = new Student();
        s.compute();
    }
}
