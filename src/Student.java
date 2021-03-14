public class Student {
    int id;
    String name, gender;
    byte age, rank; // -128 to +127
    long phone;
    double gpa;
    char degree;
    boolean international;

    static int computeCount;

    double tuitionFees = 100.0;
    double internationalFees = tuitionFees = 5000.0;

    // Integer literals: int literal, long literal

    //int minValue = Integer.MIN_VALUE;
    //int maxValue = Integer.MAX_VALUE;

    void compute(){
        computeCount++;

        int nextID = id + 1;

        if (international){
            tuitionFees += internationalFees;
        }

        System.out.println("\nid: " + id);
        System.out.println("Next id: " + nextID);
        System.out.println("name: " + name);
        System.out.println("gender: " + gender);
        System.out.println("age: " +  age);
        System.out.println("Rank: " + rank);
        System.out.println("Phone: " + phone);
        //System.out.println(minValue);
        //System.out.println(maxValue);
        System.out.println("gpa: " + gpa);
        System.out.println("degree: " + degree);
        System.out.println("tuition fees: " + tuitionFees);
        System.out.println("Compute count: " + computeCount);
    }

    boolean updateProfile(String newName){
        name = newName;
        return true;
    }

//    static Student student3;

    public static void main(String[] args){
        Student student1  = new Student();

        student1.id = 1000;
        student1.name = "John";
        student1.gender = "male";
        student1.age = 18;
        student1.rank = 127; // -128 to +127
        student1.phone = 223_456_7890L; // Java 7 onwards for readability
        student1.gpa = 3.8;
        student1.degree = '\u0041';
        student1.international = true;
        student1.compute();

        Student student2  = new Student();
        student2.id = 1001;
        student2.name = "Raj";
        student2.gender = "male";
        student2.age = 21;
        student2.rank = 126; // -128 to +127
        student2.phone = 414_654_0987L; // Java 7 onwards for readability
        student2.gpa = 3.2;
        student2.degree = '\u0042';
        student2.international = false;
        student2.compute();

        Student student3 = new Student();
        student3.id = 1002;
        student3.name = "Anita";
        student3.gender = "female";
        student3.age = 20;
        student3.phone = 223_456_8888L;
        student3.gpa = 4.0;
        student3.degree = 'M';
        student3.international = true;
        student3.compute();

        System.out.println("\nStudent.computeCount: " + Student.computeCount);

    }
}
