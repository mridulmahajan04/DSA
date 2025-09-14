package OOPs.Abstract;

public class Access {
    public static void main(String[] args) {
        Child c1 = new Child("Mridul");
        c1.carrer();
        int x = c1.MARKS;
        System.out.println(x);
        c1.hello();
    }
}
