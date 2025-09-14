package OOPs.AccessModifier.Pack1;

public class Access {
    public static void main(String[] args) {
        PrivateCheck pv =new PrivateCheck(34, "Mridul");
        ProtectedCheck pz = new ProtectedCheck(91, "Kunal");

        ProtectedInheritance pi = new ProtectedInheritance(189, "Sharma");
        int inherit = pi.num;
        System.out.println("Inherited Value from Protected Inheritance -> "+inherit);
        int z = pz.num;
        int x = pv.getNum();
        System.out.println(x);
        pv.setNum(90);
        System.out.println("New value is -> "+pv.getNum());

    }
}
