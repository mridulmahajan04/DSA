package Trees;
import java.util.*;
public class BFS {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(20);


        Queue<Node> q1 = new LinkedList<>();
        q1.add(root);
        Node rootDummy = new Node(0);
        while(!q1.isEmpty()) {
            rootDummy = q1.remove();
            System.out.print(" "+rootDummy.val);
            if(rootDummy.left != null) {
                q1.add(rootDummy.left);
            }
            if(rootDummy.right != null) {
                q1.add(rootDummy.right);
            }
        }
    }
}
