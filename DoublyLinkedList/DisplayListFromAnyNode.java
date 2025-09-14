package DoublyLinkedList;

public class DisplayListFromAnyNode {
    public static class Node{
        int val;
        Node prev;
        Node next;
        public Node(int val) {
            this.val=val;
        }
    }
//    you can also print this in front direction
    public static void displayFromAnyNode(Node head) {
        while(head.next!=null) {
            head=head.next;
        }
        while(head!=null) {
            System.out.print(" "+head.val);
            head=head.prev;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node first = new Node(2);
        Node second = new Node(3);
        Node third = new Node(4);
        Node fourth = new Node(5);
        Node fifth = new Node(6);
        Node sixth = new Node(7);

        head.prev=null;
        head.next=first;

        first.prev=head;
        first.next=second;

        second.prev=first;
        second.next=third;

        third.prev=second;
        third.next=fourth;

        fourth.prev=third;
        fourth.next=fifth;

        fifth.prev=fourth;
        fifth.next=sixth;

        sixth.prev=fifth;
        sixth.next=null;
        displayFromAnyNode(fourth);
    }
}
