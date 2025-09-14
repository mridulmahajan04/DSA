package Trees;
import java.util.ArrayList;
import java.util.List;
public class NodeToRootPath {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static void fun(Node root, List<String> l1, String s, int val) {
        if(root == null) return;
        if(root.val == val) {
            s += root.val;
            l1.add(s);
            return;
        }
        fun(root.left, l1, s+root.val+"->", val);
        fun(root.right, l1, s+root.val+"->3", val);

    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(20);
        List<String> l1 = new ArrayList<>();
        String s="";
        fun(root, l1, s, 20);
        l1=l1.reversed();
        System.out.println(l1.reversed());
    }
}
