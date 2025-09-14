package Graphs;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    static class Node{
        int val;
        List<Node> neighbours;

        public Node() {
            this.val=0;
            neighbours=new ArrayList<Node>();
        }
        public Node(int val) {
            this.val=val;
            neighbours=new ArrayList<Node>();
        }
        public Node(int val, ArrayList<Node> neighbours) {
            this.val=val;
            this.neighbours=neighbours;
        }

    }
    public static void main(String[] args) {
        Node node0 = new Node(0);
        Node node1 = new Node(1);
        Node node2= new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        node0.neighbours.add(node1);
        node0.neighbours.add(node2);

        node1.neighbours.add(node3);

        node2.neighbours.add(node4);

        node3.neighbours.add(node4);
        node3.neighbours.add(node5);
        node3.neighbours.add(node1);

        node4.neighbours.add(node5);
        node4.neighbours.add(node2);
        node4.neighbours.add(node3);

        node5.neighbours.add(node3);
        node5.neighbours.add(node4);
        node5.neighbours.add(node6);

        node6.neighbours.add(node5);
        BFS bf = new BFS();
        bf.bfs(node0);
    }

    void bfs(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        boolean[] visited = new boolean[7];
        while(!queue.isEmpty()) {
            Node curr = queue.remove();
            if(!visited[curr.val]) {
                System.out.println(curr.val);
                visited[curr.val]=true;
                for(Node neighbors : curr.neighbours) {
                    queue.add(neighbors);
                }
            }
        }
    }
}
