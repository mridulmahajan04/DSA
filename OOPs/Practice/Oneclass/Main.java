package OOPs.Practice.Oneclass;

public class Main {
    public static void main(String[] args) {
        Student.display();
        Student sc = new Student("Mridul", 12);
        Student.SchoolInfo s1 = sc.new SchoolInfo();
    }
}
