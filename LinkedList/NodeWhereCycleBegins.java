package LinkedList;

import java.util.HashSet;

public class NodeWhereCycleBegins {
    public static class Node{
        int val;
        Node next;
        public Node(int val) {
            this.val=val;
        }
    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node head = n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n2;

        HashSet<Node> st = new HashSet<>();
        while(head!=null) {
            if(st.contains(head)) {
                System.out.println(head.val);
                break;
            }else{
                st.add(head);
                head=head.next;
            }
        }
    }
}
