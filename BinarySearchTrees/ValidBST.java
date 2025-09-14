package BinarySearchTrees;

public class ValidBST {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static boolean checkIsBST(Node root, long minVal, long maxValue) {
        if(root==null) return true;
        if(root.val <= minVal || root.val >= maxValue) return false;
        return checkIsBST(root.left, minVal, root.val) && checkIsBST(root.right, root.val, maxValue);
    }
    public static boolean isValidBST(Node root) {
        if(root==null) return true;
        return checkIsBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(4);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(20);

        System.out.println(isValidBST(root));
    }
}
