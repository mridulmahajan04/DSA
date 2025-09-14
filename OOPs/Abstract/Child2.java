package OOPs.Abstract;

public class Child2 extends Parent{
    @Override
    void carrer() {
        System.out.println("I want to be a doctor");
    }

    void partner() {
        System.out.println("I love me");
    }

    public Child2(String name) {
        super(name);
    }
}
