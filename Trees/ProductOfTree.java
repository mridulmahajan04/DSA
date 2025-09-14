package Trees;

public class ProductOfTree {
        public static class Node{
            int val;
            Node left;
            Node right;
            public Node(int val) {
                this.val = val;
            }
        }
        public static int product(Node root) {
            if(root==null) return 1;
            int rootValue = root.val;
            int productLeft = product(root.left);
            int productRight = product(root.right);
            return rootValue * productLeft * productRight;
        }
        public static void main(String[] args) {
            Node root = new Node(10);
            root.left = new Node(5);
            root.right = new Node(15);
            root.left.left = new Node(2);
            root.left.right = new Node(7);
            root.right.left = new Node(12);
            root.right.right = new Node(20);
            int product = product(root);
            System.out.println(product);
        }


}
