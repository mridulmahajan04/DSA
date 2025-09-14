package DoublyLinkedList;

public class TwoSum {
    public static class Node{
                int val;
        Node prev;
        Node next;
        public Node(int val) {
            this.val=val;
        }
    }
    public static void twoSum(Node head, int target) {
        Node temp = head;
        Node tail = head;
        while(tail.next!=null) {
            tail=tail.next;
        }

        while(temp!=tail && temp.prev!=tail) {
            int sum = temp.val + tail.val;
           if(sum<target) {
               temp=temp.next;
           }
           else if(sum>target) {
               tail=tail.prev;
           }
           else {
               System.out.print(temp.val + " and "+tail.val + " is the result");
               System.out.println();
               tail=tail.prev;
               temp=temp.next;
           }
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
        twoSum(head, 13);
    }
}
