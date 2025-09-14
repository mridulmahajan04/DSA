package LinkedList;

public class SplitLinkedListIntoTwoLists {
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
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node head = n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        n7.next=n8;

        Node evenList = new Node(-1);
        Node oddList = new Node(-1);
        Node headA = evenList;
        Node headB = oddList;

        Node fullList = headA;
        while(head!=null) {
            Node nextNode = head.next;
            head.next=null;
            if(head.val%2 == 0) {
                evenList.next= head;
                evenList=evenList.next;
            }else{
                oddList.next=head;
                oddList=oddList.next;
            }
            head=nextNode;
        }
        evenList=headA;
        oddList=headB;
        headA=headA.next;
        while(headA!=null) {
            System.out.print(" "+headA.val);
            headA=headA.next;
        }
        headB=headB.next;
        System.out.println();
        while(headB!=null) {
            System.out.print(" "+headB.val);
            headB=headB.next;
        }


//      Combine Head A and Head B
        Node headEven = evenList;
        Node headOdd = oddList;
        headEven=headEven.next;
        headOdd=headOdd.next;
        while(headEven.next!=null) {
            headEven=headEven.next;
        }
        headEven.next=headOdd;
        System.out.println();
        evenList=evenList.next;
        while(evenList!=null) {
            System.out.print(" "+evenList.val);
            evenList=evenList.next;
        }
    }
}
