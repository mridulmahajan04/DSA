package OOPs.Properties.Inheritance;

public class Main extends Human{
    float marks;
    Main(String name, int age, String fatherName, float marks) {
        super(name, age, fatherName);
        this.marks=marks;
    }

    public static void main(String[] args) {
        Main obj = new Main("Mridul Mahajan", 21, "Rajeev", 90.23f);
        System.out.println(obj.name);
    }
}
