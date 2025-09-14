package Stacks;

import java.util.Stack;

public class PreviousSmallerElement {
    public static void pse(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];
        res[0]=-1;
        st.push(arr[0]);
        for(int i=1; i<arr.length; i++) {
            while(!st.isEmpty() && st.peek()>arr[i]) {
                st.pop();
            }
            if(st.isEmpty()) {
                res[i]=-1;
            }else {
                res[i]=st.peek();
            }
            st.push(arr[i]);

        }
        for(int i: res) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 3, 5};
        pse(arr);
    }
}
