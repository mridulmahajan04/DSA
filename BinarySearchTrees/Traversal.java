package BinarySearchTrees;

public class Traversal {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val) {
            this.val = val;
        }
    }
    public static void preorder(Node root) {
        if(root==null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root) {
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }
    public static void inorder(Node root) {
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(4);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(20);
        System.out.print("Preorder" + " ");
        preorder(root);
        System.out.println();
        System.out.print("Postorder" + " ");
        postorder(root);

        System.out.println();
        System.out.print("Inorder" + " ");
        inorder(root);
    }

}
