package OOPs.AccessModifier.Pack1;

public class ProtectedCheck {
    protected int num;
    String name;
    public ProtectedCheck() {

    }
    public ProtectedCheck(int num, String name) {
        this.num=num;
        this.name=name;
    }

    int getNum() {
        return num;
    }

    void setNum(int n) {
        this.num=n;
    }
}
