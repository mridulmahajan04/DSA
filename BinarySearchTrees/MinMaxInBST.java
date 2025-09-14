package BinarySearchTrees;

public class MinMaxInBST {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val) {
            this.val = val;
        }
    }

    public static void min(Node root) {
        while(root.left!=null) {
            root=root.left;
        }
        System.out.println(root.val);
    }

    public static void max(Node root) {
        while(root.right!=null) {
            root=root.right;
        }
        System.out.println(root.val);
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(4);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(20);
        min(root);
        max(root);
    }
}
