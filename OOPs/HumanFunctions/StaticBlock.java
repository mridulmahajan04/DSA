package OOPs.HumanFunctions;

public class StaticBlock {
    static int a = 10;
    static int b;

    static {
        b = 20;
        System.out.println("Entered the static Block and it will call only once");
    }

    public static void main(String[] args) {
        System.out.println(a);
        Functions f1 = new Functions();
    }
}
