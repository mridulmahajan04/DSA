package BinarySearchTrees;

public class PredecessorAndSuccessor {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public static void predecessor(Node root) {
        Node pred = root.left;
        while(pred.right!=null) pred=pred.right;
        System.out.println("The Predecessor of "+root.val+" is "+pred.val);
    }
    public static void successor(Node root) {
        Node succ = root.right;
        while(succ.left!=null) succ=succ.left;
        System.out.println("The Predecessor of "+root.val+" is "+succ.val);

    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(4);
        root.left.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(20);
        predecessor(root.right);
        successor(root);
    }
}
