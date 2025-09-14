package Graphs;

import java.util.ArrayList;

public class CycleDetectionUndirectedGraph {
    static class Node{
        int src;
        int des;
        public Node(int src, int des) {
            this.src=src;
            this.des=des;
        }
    }
    public static void createGraph(ArrayList<Node> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Node(0, 1));

        graph[1].add(new Node(1, 4));
        graph[1].add(new Node(1, 0));
        graph[1].add(new Node(1, 2));

        graph[2].add(new Node(2, 1));
        graph[2].add(new Node(2, 3));

        graph[3].add(new Node(3, 2));

        graph[4].add(new Node(4, 0));
        graph[4].add(new Node(4, 1));
        graph[4].add(new Node(4, 5));

        graph[5].add(new Node(5, 4));

    }
    public static boolean modifiedDFS(ArrayList<Node> graph[], int curr, boolean vis[], int par) {
        vis[curr] = true;
        for(int i=0; i<graph[curr].size(); i++) {
            Node e = graph[curr].get(i);
            if(!vis[e.des]) {
                return modifiedDFS(graph, e.des, vis, curr);
            }
            else if(vis[e.des] && par!=e.des){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Node> graph[] = new ArrayList[6];
        createGraph(graph);
        boolean val = modifiedDFS(graph, 0, new boolean[6], -1);
        System.out.println(val);
    }
}
