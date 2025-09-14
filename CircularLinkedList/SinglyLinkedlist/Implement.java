package CircularLinkedList.SinglyLinkedlist;

import javax.sound.midi.ControllerEventListener;

public class Implement {
    public static class Node{
        int val;
        Node next;
        public Node(int val) {
            this.val=val;
        }
    }
    public static void display(Node head) {
        Node temp = head.next;
        System.out.print(head.val);
        while(temp!=head) {
            System.out.print(" "+temp.val);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node one = new Node(20);
        Node two = new Node(30);
        Node three = new Node(40);
        Node four = new Node(50);
        Node five = new Node(60);

        head.next= one;
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        five.next=head;
        display(one);
    }
}
