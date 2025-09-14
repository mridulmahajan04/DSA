package OOPs.Practice.Oneclass;

public class Student {
    static String schoolName = "DAV Public School";
    String name;
    int age;

    Student(String name, int age) {
        this.name=name;
        this.age=age;
    }
//    Static Method -> This method can access only Static variable whereas Normal Method can access any variable.
    static void display() {
        System.out.println("The Name of school is "+schoolName+", Chamba");
    }
//    School Info Class
    class SchoolInfo {
        String location = "Hardaspura, Chamba";
        int teacher = 1000;

        void display() {
            System.out.println(location);
            System.out.println("Teacher Strength is "+teacher);
        }
    }
}
