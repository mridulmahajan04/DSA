package Graphs;
import java.util.List;
import java.util.ArrayList;

public class Implementation {
    static class Edge {
        int src;
        int des;
        int weight;
        public Edge(int s, int d) {
            this.src=s;
            this.des=d;
        }
        public Edge(int s, int d, int weight) {
            this.src=s;
            this.des=d;
            this.weight=weight;
        }
    }

    static class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
    public static void createGraphs(ArrayList<Edge> graph[]) {
        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2, 2));

        graph[1].add(new Edge(1, 3, 0));
        graph[1].add(new Edge(1, 2, 10));

        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 1, 10));
        graph[2].add(new Edge(2, 3, -1));

        graph[3].add(new Edge(3, 2, -1));
        graph[3].add(new Edge(3, 1, 0));


    }
    public static void main(String[] args) {
//        int v = 4;
//        ArrayList<Edge> graph[] = new ArrayList[v];
//        createGraphs(graph);
//
//        for(int i=0; i<graph[1].size(); i++) {
//            Edge e = graph[1].get(i);
//            System.out.println(e.src +" -> "+e.des + " -> "+e.weight);
//        }

        Node node1 = new Node(0);
        Node node2 = new Node(1);
        Node node3 = new Node(2);

        node1.neighbors.add(node2);
        node2.neighbors.add(node1);
        node3.neighbors.add(node2);

        for(Node neighbors : node2.neighbors) {
            System.out.println(neighbors.val);
        }
    }
}
