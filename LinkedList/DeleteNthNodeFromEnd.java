package LinkedList;

public class DeleteNthNodeFromEnd {
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

        int n = 5;
//        Two Traversals
//        int count=0;
//        while(head!=null) {
//            count++;
//            head=head.next;
//        }
//        head=n1;
//        System.out.println(count);
//        int elementToDelete=count-n+1;
//        int index=1;
//        while(index!=elementToDelete) {
//            head=head.next;
//            index++;
//        }
//        System.out.println(head.val);

//        One time Traversal Using slow and fast Pointer
        Node slow = head;
        Node fast = head;
        for(int i=0; i<n; i++) {
            fast=fast.next;
        }
        while(fast!=null && fast.next!=null) { // As we also want to remove the nth node so for that purpose we are using fast.next!=null, otherwise if you only want to access the element in that case simply use fast!=null
            slow=slow.next;
            fast=fast.next;
        }
        System.out.println(slow.val);

//      Removing Nth Node from end of Linked List
        if(slow==head) {
            head=head.next;
        }else{
            slow.next=slow.next.next;
        }
        while(head!=null) {
            System.out.print(head.val + " ");
            head=head.next;
        }
    }
}
