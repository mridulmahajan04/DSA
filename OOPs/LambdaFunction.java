package OOPs;

interface Operation {
    void operate(int a, int b);
}
public class LambdaFunction {
    private void Operate(int a, int b, Operation op) {
        op.operate(a, b);
    }
    public static void main(String[] args) {
        Operation sum = (a, b) -> {
            System.out.println(a+b);
        };

        LambdaFunction f1 = new LambdaFunction();
        f1.Operate(1, 25, sum);
    }
}
