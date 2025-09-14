package DoublyLinkedList;

public class Palindrome {
    public static class Node{
        int val;
        Node prev;
        Node next;
        public Node(int val) {
            this.val=val;
        }
    }
    public static boolean palindrome(Node head) {
        Node temp = head;
        while(temp.next!=null) {
            temp=temp.next;
        }
        while(temp!=head) {
            if(temp.val==head.val) {
                temp=temp.prev;
                head=head.next;
            }else return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node first = new Node(2);
        Node second = new Node(3);
        Node third = new Node(4);
        Node fourth = new Node(3);
        Node fifth = new Node(2);
        Node sixth = new Node(1);

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

        boolean ret = palindrome(head);
        System.out.println(ret);

    }
}
