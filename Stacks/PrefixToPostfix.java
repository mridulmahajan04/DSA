package Stacks;

import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        String prefix="-9/*+5346";
        Stack<String> val = new Stack<>();
        for(int i=prefix.length()-1; i>=0; i--) {
            char ch = prefix.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57) {
                val.push(""+ch);
            }else{
                String val1 = val.pop();
                String val2 = val.pop();
                char operator = ch;
                val.push(val1+val2+operator);
            }
        }
        System.out.println(val.pop());
    }
}
