package Trees;

public class MinValue {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val) {
            this.val = val;
        }
    }
    public static int minValue(Node root) {
        if(root==null) return Integer.MAX_VALUE;
        int rootValue = root.val;
        int minLeft = minValue(root.left);
        int minRight = minValue(root.right);

        return Math.min(rootValue, Math.min(minLeft, minRight));
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(20);
        int minValue = minValue(root);
        System.out.println(minValue);


    }
}
