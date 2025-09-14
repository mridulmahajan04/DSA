package DoublyLinkedList;

public class Delete {
    public static class Node{
        int val;
        Node prev;
        Node next;
        public Node(int val) {
            this.val=val;
        }
    }
    public static void display(Node head) {
        while(head!=null) {
            System.out.print(" "+head.val);
            head=head.next;
        }
    }
    public static Node deleteFromStart(Node head) {
        head=head.next;
        head.prev=null;
        return head;
    }

    public static Node deleteFromMid(Node head, int index) {
        Node temp = head;
        int count = 1;
        while(count<index-1) {
            head=head.next;
            count++;
        }
        head.next=head.next.next;
        head.next.prev=head;
        return temp;
    }

    public static Node deleteFromEnd(Node head) {
        Node temp = head;
        while(head.next!=null) {
            head=head.next;
        }
        head.prev.next=null;
        head.prev=null;
        return temp;
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

        display(head);
        System.out.println();
        head = deleteFromStart(head);
        display(head);

        System.out.println();
        head=deleteFromEnd(head);
        display(head);

        System.out.println();
        int index = 2;
        head=deleteFromMid(head, index);
        display(head);


    }
}
