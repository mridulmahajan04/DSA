package BinarySearchTrees;

public class CreateBSTFromSortedArray {
    public static class Node{
        int val;
        Node right;
        Node left;
        public Node(int val) {
            this.val=val;
        }
    }
    public static int Mid(int[] nums, int low, int high) {
        if(low > high) return -1;
        return (low+high)/2;
    }
    public static Node constructTree(int[] nums, int low, int high) {
        int mid = Mid(nums, low, high);
        if(mid==-1) return null;
        Node root = new Node(nums[mid]);
        root.left = constructTree(nums, low, mid-1);
        root.right=constructTree(nums, mid+1, high);
        return root;
    }
    public static void inorder(Node root) {
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        Node root = constructTree(arr, 0, arr.length-1);
        inorder(root);
    }
}
