package OOPs.Properties.Inheritance.MultilevelInheritance;

public class Child extends Parent{
    String schoolName;
    String gf;
    Child(String occupation, String schoolName, String gf) {
        super("Mridul", 10, occupation);
        this.schoolName=schoolName;
        this.gf=gf;
    }
    Child() {

    }

    public static void main(String[] args) {
        Child c1 = new Child("Computer Science", "Thapar Institute", "Sorry");

        System.out.println(c1.name);
    }
}

