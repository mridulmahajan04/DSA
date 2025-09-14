package OOPs.AccessModifier.Pack2;
import OOPs.AccessModifier.Pack1.ProtectedCheck;
public class InheritedProtectedFromAnotherPack extends ProtectedCheck{
    InheritedProtectedFromAnotherPack(int num, String name) {
    super(num, name);
    }
    public static void main(String[] args) {
        InheritedProtectedFromAnotherPack ipc = new InheritedProtectedFromAnotherPack(1059, "Kunal");
        int x = ipc.num;
        System.out.println(x);
    }
}
