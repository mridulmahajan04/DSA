package OOPs.AccessModifier.Pack1;

public class PrivateCheck {
    private int num;
    String name;

    PrivateCheck(int num, String name) {
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
