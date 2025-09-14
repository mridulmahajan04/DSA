package BinarySearchTrees;

import java.util.List;
import java.util.ArrayList;
public class FindModeInBST {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public static void inorder(Node root, List<Integer> arr) {
        if(root==null) return;
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }
    public static void findMode(Node root) {
        List<Integer> arr = new ArrayList<>();
        List<Integer> mode=  new ArrayList<>();
        inorder(root, arr);
        int prevEl = Integer.MIN_VALUE;
        int count=0;
        int maxEl = 0;
        int maxCount=Integer.MIN_VALUE;
        for(int i=0;i<arr.size();i++) {
            int curr = arr.get(i);
            if(i > 0 && curr == arr.get(i-1)) {
                count++;
            }else{
                count=1;
            }
            if(count > maxCount) {
                maxCount=count;
                mode.clear();
                mode.add(arr.get(i));
            }else if(count==maxCount) {
                mode.add(arr.get(i));
            }
        }

        for(int i:mode) {
            System.out.print(i + " ");
        }

    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(4);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(20);
        findMode(root);
    }
}
