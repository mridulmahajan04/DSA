package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReorderQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);

//        Stack<Integer> stack2 = new Stack<>();
//        int len = (queue.size())/2;
//        int i = 1;
//
//        while(i<=len) {
//            stack.push(queue.remove());
//            i++;
//        }
//        i=1;
//        while(i<=len) {
//            stack2.push(queue.remove());
//            i++;
//        }
//        while(!stack.isEmpty() && !stack2.isEmpty()) {
//            queue.add(stack2.pop());
//            queue.add(stack.pop());
//        }
//        System.out.println(queue);
//        int size = queue.size();
//        while(size!=0) {
//            stack.push(queue.remove());
//            size--;
//        }
//
//        while(!stack.isEmpty()) {
//            queue.add(stack.pop());
//        }
//        System.out.println(queue);

        int size = queue.size() / 2;
        while (size != 0) {
            stack.push(queue.remove());
            size--;
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        size = queue.size() / 2;
        while (size != 0) {
            stack.push(queue.remove());
            size--;
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
            queue.add(queue.remove());
        }
        System.out.println(queue);

        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        System.out.println(queue);
    }
}


