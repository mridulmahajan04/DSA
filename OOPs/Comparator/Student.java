package OOPs.Comparator;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    float marks;
    int rollno;

    Student(int roll, float marks) {
        this.rollno=roll;
        this.marks=marks;
    }

    @Override
    public int compareTo(Student o) {
        return (int)(marks-o.marks);
    }
}
