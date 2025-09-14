package Stacks;
import java.util.Stack;
public class NextSmallerElement {
    public static void nse(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int res[] = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                res[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()) {
            res[stack.pop()] = -1;
        }
        for(int i : res) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 3, 5};
        nse(arr);
    }
}
