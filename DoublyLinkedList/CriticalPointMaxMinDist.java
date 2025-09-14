package DoublyLinkedList;

import java.util.ArrayList;

public class CriticalPointMaxMinDist {
    public static class Node{
        int val;
        Node prev;
        Node next;
        public Node(int val) {
            this.val=val;
        }
    }
    public static void criticalPoint(Node head) {
        ArrayList<Integer> arr = new ArrayList<>();
        int count=1;
        while(head!=null) {
            if(head.prev!=null && head.next!=null) {
                if(head.val>head.prev.val && head.val>head.next.val) {
                    arr.add(count);
                }else if(head.val<head.prev.val && head.val<head.next.val) {
                    arr.add(count);
                }
            }
            count++;
            head=head.next;
        }
        System.out.println(arr);
        int maxDist = Integer.MIN_VALUE;
        int left=0;
        int right = arr.size()-1;
        while(left<=right) {
            int dist = arr.get(right)- arr.get(left);
            if(dist>maxDist) {
                maxDist=dist;
            }
            left++;
            right--;
        }
        System.out.println("Maximum Distance is "+maxDist);
        int minDist = Integer.MAX_VALUE;
        for(int i=1; i<arr.size(); i++) {
            int dis = arr.get(i)-arr.get(i-1);
            if(dis<minDist) {
                minDist=dis;
            }
        }
        System.out.println("Minimum distance is "+minDist);

    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node first = new Node(2);
        Node second = new Node(5);
        Node third = new Node(3);
        Node fourth = new Node(2);
        Node fifth = new Node(7);
        Node sixth = new Node(8);
        Node seventh = new Node(9);
        Node eight = new Node(1);
        Node nine = new Node(10);

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
        sixth.next=seventh;

        seventh.next=eight;
        seventh.prev=sixth;

        eight.prev=seventh;
        eight.next=nine;

        nine.prev=eight;
        nine.next=null;
        criticalPoint(head);
    }
}
