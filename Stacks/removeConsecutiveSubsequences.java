package Stacks;

import java.util.Stack;

public class removeConsecutiveSubsequences {
    public static int[] remove(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<arr.length; i++) {
            if(stack.isEmpty()) {
                stack.push(arr[i]);
            }else{
                if(stack.peek()==arr[i]) {
                    if(i+1<arr.length-1 && arr[i]==arr[i+1]) {
                        continue;
                    }else{
                        stack.pop();
                    }
                }else{
                    stack.push(arr[i]);
                }
            }
        }
        int[] array = new int[stack.size()];
        int j = array.length-1;
        while(!stack.isEmpty()) {
            array[j--] = stack.pop();
        }
        return array;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 8};
        int[] res = remove(arr);
        for(int i=0; i<res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
