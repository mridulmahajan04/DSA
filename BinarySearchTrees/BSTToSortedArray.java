package BinarySearchTrees;
import java.util.ArrayList;
import java.util.List;
public class BSTToSortedArray {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val) {
            this.val = val;
        }
    }
    public static void sortedArray(Node root, List<Integer> arr) {
        if(root==null) return;
        sortedArray(root.left, arr);
        arr.add(root.val);
        sortedArray(root.right, arr);
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(4);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(20);
        sortedArray(root, arr);
        for(int i : arr) {
            System.out.print(i+" ");
        }
    }
}
