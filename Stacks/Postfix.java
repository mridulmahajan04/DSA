package Stacks;

import com.sun.jdi.IntegerValue;

import java.util.Stack;

public class Postfix {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<Integer> postfix = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57) {
                postfix.push(ascii-48);
            }else{
                int val2=postfix.pop();
                int val1=postfix.pop();
                if(ch=='+') postfix.push(val1+val2);
                if(ch=='-') postfix.push(val1-val2);
                if(ch=='*') postfix.push(val1*val2);
                if(ch=='/') postfix.push(val1/val2);
            }
        }
        System.out.println(postfix.peek());
    }
}
