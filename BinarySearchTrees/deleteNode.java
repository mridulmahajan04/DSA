package BinarySearchTrees;

public class deleteNode {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public static void delete(Node root, int target) {
        if(root==null) return;
        if(root.val>target) {
            if(root.left == null) System.out.println("Element is not in list");
            else if(root.left.val == target) {
                if(root.left.left == null && root.left.right != null) {
                    root.left=root.left.right;
                }
                else if(root.left.left != null && root.left.right == null) {
                    root.left=root.left.left;
                }
                else if(root.left.left == null && root.left.right == null) {
                    root.left = null;
                }
                else{ // 2children
                    Node curr = root;
                    Node predecessor = curr.left.left;
                    while(predecessor.right!=null) {
                        predecessor = predecessor.right;
                    }
                    delete(root, predecessor.val);
                    predecessor.left=curr.left.left;
                    predecessor.right=curr.left.right;
                    root.left=predecessor;
                }
            }
            else delete(root.left, target);
        }else {
            if(root.right == null) System.out.println("Element is not in list");
            else if(root.right.val == target) {
                if(root.right.left != null && root.right.right == null) {
                    root.right=root.right.left;
                }else if(root.right.left == null && root.right.right != null) {
                    root.right=root.right.right;
                }
                else if(root.left.left == null && root.left.right == null) {
                    root.right = null;
                }
                else{ // 2children
                    Node curr = root;
                    Node predecessor = curr.left.left;
                    while(predecessor.right!=null) {
                        predecessor = predecessor.right;
                    }
                    delete(root, predecessor.val);
                    predecessor.left=curr.left.left;
                     predecessor.right=curr.left.right;
                    root.right=predecessor;
                }
            }
            else delete(root.right, target);
        }
    }
    public static void inorder(Node root) {
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
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

        inorder(root);
        System.out.println();
        delete(root,5);
        inorder(root);
    }
}
