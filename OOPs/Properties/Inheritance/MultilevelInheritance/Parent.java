package OOPs.Properties.Inheritance.MultilevelInheritance;

public class Parent extends Human{
    String occupation;
    Parent(String name, int age, String occupation) {
        super(name, age);
        this.occupation=occupation;
    }
    Parent() {

    }
}
