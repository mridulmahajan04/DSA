package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {
    static class Pair{
        int node;
        int dist;
        Pair(int node, int dist) {
            this.node=node;
            this.dist=dist;
        }
    }
    public int[] dijkstra(int V, int[][] edges, int src) {
        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0; i<V; i++) {
            adj.add(new ArrayList<>());
        }
        for(int edge[] : edges) {
            int v = edge[0];
            int u = edge[1];
            int w = edge[2];
            adj.get(v).add(new Pair(u, w));
            adj.get(u).add(new Pair(u, w));
        }
        int[] dist = new int[V];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b)->(a.dist-b.dist));
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src]=0;
        pq.add(new Pair(src, 0));
        while(!pq.isEmpty()) {
            Pair curr = pq.poll();
            int u = curr.node;
            int d = curr.dist;

            for(Pair i : adj.get(u)) {
                int v = i.node;
                int wt = i.dist;
                if(dist[u]+wt < dist[v]) {
                    dist[v]=dist[u]+wt;
                    pq.add(new Pair(v, dist[v]));
                }
            }
        }
        return dist;
    }
}
