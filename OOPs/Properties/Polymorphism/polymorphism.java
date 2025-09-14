package OOPs.Properties.Polymorphism;

public class polymorphism {
    static int sum(int a, double b ) {
        return (int)(a+b);
    }

    static int sum(double b, int a) {
        return (int)b+a;
    }

    static int sum(int a, int b, int c) {
        return a+b+c;
    }

    public static void main(String[] args) {
        int c = sum(10, 12, 10);
        System.out.println(c);
    }
}
