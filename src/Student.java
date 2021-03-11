public class Student {
    int id = 1000;
    String name;
    String gender;

    void compute(){

        int nextID = id + 1;
        System.out.println("id: " + id);
        System.out.println("Next id: " + nextID);
    }

    boolean updateProfile(String newName){
        name = newName;
        return true;
    }

    public static void main(String args[]){
        Student s = new Student();
        s.compute();
    }
}
