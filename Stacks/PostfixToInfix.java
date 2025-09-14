package Stacks;

import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        Stack<String> val = new Stack<>();
        String postfix = "953+4*6/-";

        for(int i=0; i<postfix.length(); i++) {
            char ch = postfix.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57) {
                val.push(""+ch);
            }else{
                String val2 = val.pop();
                String val1 = val.pop();
                val.push("("+val1+ch+val2+")");
            }
        }
        System.out.println(val.peek());
    }
}
