package OOPs.Comparator;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Student Mridul = new Student(120, 999.5f);
        Student Mahajan = new Student(110, 994.5f);
        System.out.println(Mahajan.compareTo(Mridul));
    }

}
