public class Student {
    int id;
    String name, gender;
    int age;
    byte rank; // -128 to +127
    long phone;
    double gpa;
    char degree;
    boolean international;

    static int studentCount;

    double tuitionFees = 100.0;
    double internationalFees = tuitionFees = 5000.0;

    // Integer literals: int literal, long literal

    //int minValue = Integer.MIN_VALUE;
    //int maxValue = Integer.MAX_VALUE;

    Student(int newId,
            String newName,
            String newGender,
            int newAge,
            long newPhone,
            double newGpa
            ,char newDegree,
            boolean isInternational){
        id = newId;
        name = newName;
        gender = newGender;
        age = newAge;
        phone = newPhone;
        gpa = newGpa;
        degree = newDegree;
        international = isInternational;

//        compute();
        studentCount++;

        if (international){
            tuitionFees += internationalFees;
        }

        System.out.println("\nid: " + id);
        System.out.println("name: " + name);
        System.out.println("gender: " + gender);
        System.out.println("age: " +  age);
        System.out.println("Phone: " + phone);
        System.out.println("gpa: " + gpa);
        System.out.println("degree: " + degree);
        System.out.println("tuition fees: " + tuitionFees);
        System.out.println("Compute count: " + studentCount);
    }

//    void compute(){
//        computeCount++;
//    }

    boolean updateProfile(String newName){
        name = newName;
        return true;
    }

//    static Student student3;

    public static void main(String[] args){
        Student student1 = new Student(1000,
                                       "John",
                                       "male",
                                       18,
                                       223_456_7890L,
                                       3.8,
                                       'B',
                                       false);

        Student student2 = new Student(1001,
                                       "Raj",
                                       "male",
                                       21,
                                       414_654_0987L,
                                       3.2,
                                       '\u0042',
                                       true);

        Student student3 = new Student(1002,
                                       "Anita",
                                       "female",
                                       20,
                                       223_456_8888L,
                                       4.0,
                                       'M',
                                       false);

        System.out.println("\nStudent.computeCount: " + Student.studentCount);

    }
}
