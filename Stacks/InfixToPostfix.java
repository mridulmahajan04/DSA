package Stacks;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii<=57) {
                val.push(""+ch);
            }else{
                if(op.isEmpty() || ch=='(' || op.peek()=='(') {
                    op.push(ch);
                }
                else if(ch==')') {
                    while(op.peek()!='(') {
                        String val2 = val.pop();
                        String val1 = val.pop();
                        char operator = op.pop();
                        val.push(val1+val2+operator);
                    }
                    op.pop(); //To remove (
                }
                else if(ch=='+' | ch=='-') {
                    String val2 = val.pop();
                    String val1 = val.pop();
                    char operator = op.pop();
                    val.push(val1+val2+operator);
                    op.push(ch);
                }else{
                    if(op.peek()=='*' || op.peek()=='/') {
                        String val2 = val.pop();
                        String val1 = val.pop();
                        char operator = op.pop();
                        val.push(val1+val2+operator);
                        op.push(ch);
                    }else{
                        op.push(ch);
                    }
                }
            }

        }
        while(val.size() > 1) {
            String val2 = val.pop();
            String val1 = val.pop();
            char operator = op.pop();
            val.push(val1+val2+operator);
        }

        System.out.println(val.pop());
    }
}
