package Stacks;

import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
//            '0' -> 48 and '9' -> 57
            if(ascii>=48 && ascii<=57) {
                 String s = ""+ch;
                 val.push(s);
            }
            else{ //This means that ch is not number it's an operator
                if(op.isEmpty() || ch=='(' || op.peek()=='(') {
                    op.push(ch);
                }else{
                    if(ch==')'){
                        while(op.peek() != '(') {
                            String val2 = val.pop();
                            String val1 = val.pop();
                            char o = op.pop();
                            String t = o+val1+val2;
                            val.push(t);
                        }
                        op.pop();
                    }
                    else if(ch=='+' || ch=='-') {
                        String val2 = val.pop();
                        String val1 = val.pop();
                        char o = op.pop();
                        String t = o+val1+val2;
                        op.push(ch);
                        val.push(t);
                    }else{
                        if(op.peek() == '/' || op.peek() == '*') {
                            String val2 = val.pop();
                            String val1 = val.pop();
                            char o = op.pop();
                            String t = o+val1+val2;
                            op.push(ch);
                            val.push(t);
                        }else{
                            op.push(ch);
                        }
                    }
                }
            }
        }
        while(val.size() > 1) {
            String val2 = val.pop();
            String val1 = val.pop();
            char o = op.pop();
            String t = o+val1+val2;
            val.push(t);
        }

        System.out.println(val.peek());
    }
}
