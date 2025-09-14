package Graphs;

import java.util.ArrayList;

public class AllPathFromSourceToDest {
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
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Node(0, 1));
        graph[0].add(new Node(0, 2));

        graph[1].add(new Node(1, 0));
        graph[1].add(new Node(1, 3));

        graph[2].add(new Node(2, 0));
        graph[2].add(new Node(2, 4));

        graph[3].add(new Node(3, 1));
        graph[3].add(new Node(3, 4));
        graph[3].add(new Node(3, 5));

        graph[4].add(new Node(4, 2));
        graph[4].add(new Node(4, 3));
        graph[4].add(new Node(4, 5));

        graph[5].add(new Node(5, 3));
        graph[5].add(new Node(5, 4));
        graph[5].add(new Node(5, 6));

        graph[6].add(new Node(6, 5));

    }
    public static void modified_dfs(ArrayList<Node> graph[], int curr, boolean visited[], int tar, String path) {
        if(curr==tar) {
            System.out.println(path);
            return;
        }

        for(int i=0; i<graph[curr].size(); i++) {
            Node e = graph[curr].get(i);
            if(!visited[e.des]) {
                visited[curr] = true;
                modified_dfs(graph, e.des, visited, tar, path+e.des);
                visited[curr] = false;
            }
        }

    }
    public static void main(String[] args) {
        ArrayList<Node> graph[] = new ArrayList[7];
        createGraph(graph);
        int curr = 0;
        boolean[] visited = new boolean[7];
        int tar=5;
        String path="";
        modified_dfs(graph, curr, visited, tar, "0");
    }
}
