package OOPs.Abstract;

public abstract class Parent {
    final int MARKS;
    String name;
    public Parent(String name) {
        MARKS=1000;
    }

    public void hello() {
        System.out.println("Hello from abstract");
    }
    abstract void carrer();
    abstract void partner();
}
