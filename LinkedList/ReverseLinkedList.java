package LinkedList;

public class ReverseLinkedList {
    public static class Node{
        int val;
        Node next;
        public Node(int val) {
            this.val=val;
        }
    }
    public static Node reverseRecursive(Node head) {
        if(head.next==null) return head;
        Node newHead = reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }

    public static Node reverse(Node head) {
        Node temp = head;
        Node curr = head;
        Node prev = null;
        Node next = curr;
        while(curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        n7.next=n8;
//        Node x = reverseRecursive(n1);
//        while(x!=null) {
//            System.out.print(" " + x.val);
//            x=x.next;
//        }
        Node head = reverse(n1);
        while(head!=null) {
            System.out.print(" "+head.val);
            head=head.next;
        }

    }
}
