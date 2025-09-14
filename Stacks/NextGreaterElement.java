package Stacks;

import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] arr) {
        int[] res = new int[arr.length];
        res[res.length-1]=-1;
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length-1]);
        for(int i=arr.length-2; i>=0; i--) {
            while(!st.isEmpty() && st.peek() < arr[i]) {
                st.pop();
            }
            if(st.isEmpty()) {
                res[i]=-1;
            }else{
                res[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
         int[] arr = {1, 3, 2, 1, 6, 3, 4};
         int[] res = nextGreaterElement(arr);
         for(int i=0; i<res.length; i++) {
             System.out.print(res[i]+" ");
         }
    }
}
