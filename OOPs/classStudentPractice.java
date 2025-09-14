package OOPs;
class Student {
    int rollno;
    float marks;
    String name;

//    Constructor
//    Student s1 = new Student(10, 12.5f, "Arpit")
    Student(int rollno, float marks, String name) {
        this.rollno=rollno;
        this.marks=marks;
        this.name=name;
    }
//    Student s1 = new Student(10, "Arpit")
    Student(int rollno, String name) {
        this.rollno=rollno;
        this.name=name;
    }

//    Student s1 = new Student(other student object)
    Student(Student otherStudent) {
        this.name=otherStudent.name;
        this.rollno=otherStudent.rollno;
        this.marks= otherStudent.marks;
    }
//    How to call constructor from other constructor
//    This will be default value for student who is created without passing any param ie Student s1 = new Student();
    Student() {
        this (12, "Mridul");
    }
    void changeName(String name) {
        this.name=name;
    }

    void greetings() {
        System.out.println("Hello! "+this.name+" is gretting");
    }
}
public class classStudentPractice {
    public static void main(String[] args) {
        Student s1 = new Student(12, 99.5f, "Mridul" );
//        s1.greetings();
//        s1.changeName("Mahajan");
//        s1.greetings();
//        System.out.println(s1.name);
        Student s2 = new Student(10, "Rahul");
//        System.out.println(s2.name);
//        System.out.println(s1.name);

        Student s3 = new Student(s2);
//        System.out.println("The Name of S3 is " +s3.name);

        Student s4 = new Student();
//        System.out.println("It will give you the default name is "+s4.name);

        Student one = new Student(100, 12.5f, "Prachi");
        Student two = one;
        two.name="Prachi Changes";
        System.out.println(two.name);
        System.out.println(one.name);


//        Final Keyword is used to create a constant
    }
}
