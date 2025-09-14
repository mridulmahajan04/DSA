package DoublyLinkedList;

public class Insert {
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
    public static Node insertAtStart(Node head) {
        Node newNode = new Node(10);
        newNode.next=head;
        newNode.prev=null;
        head.prev=newNode;
        return newNode;

    }

    public static Node insertAtMid(Node head, int index) {
        Node temp = head;
        Node newNode = new Node(20);
        int count=1;
        while(count<index-1) {
            head=head.next;
            count++;
        }
        newNode.next=head.next;
        head.next.prev=newNode;
        head.next=newNode;
        newNode=head;
        return temp;
    }
    public static Node insertAtEnd(Node head) {
        Node temp = head;
        while(head.next!=null) {
            head=head.next;
        }
        Node newNode = new Node(40);
        head.next=newNode;
        newNode.next=null;
        newNode.prev=head;
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
        head = insertAtStart(head);
        System.out.println();
        System.out.println("After Adding new Element to the start");
        display(head);

        head=insertAtEnd(head);
        System.out.println();
        System.out.println("After Adding new Element to the End");
        display(head);
        int index = 4;
        head = insertAtMid(head, index);
        System.out.println();
        System.out.println("After Adding new Element in the index : "+index);
        display(head);



    }
}
