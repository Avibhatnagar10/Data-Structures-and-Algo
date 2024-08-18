package Graphs;
import java.util.*;

public class BFS {
    static class edge {
        int src;
        int dst;

        public edge(int s, int d) {
            this.src = s;
            this.dst = d;
        }
    }

    public static void createGraph(ArrayList<edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 2));

        graph[1].add(new edge(1, 0));
        graph[1].add(new edge(1, 2));

        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 1));

        graph[3].add(new edge(3, 4));
        graph[3].add(new edge(3, 5));

        graph[4].add(new edge(4, 3));
        graph[4].add(new edge(4, 5));

        graph[5].add(new edge(5, 3));
        graph[5].add(new edge(5, 4));
        graph[5].add(new edge(5, 6));

        graph[6].add(new edge(6, 5));
    }

    public static void BFS(ArrayList<edge>[] graph, int V, boolean[] vis, int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        vis[start] = true;

        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");
            vis[curr] = true;

            for (int i = 0; i < graph[curr].size(); i++) {
                edge e = graph[curr].get(i);
                if (!vis[e.dst]) {
                    q.add(e.dst);
                    vis[e.dst] = true;  // Mark as visited when added to the queue
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<edge>[] graph = new ArrayList[V];
        createGraph(graph);
        boolean[] vis = new boolean[V];
          for(int i=0;i<V;i++){
              if(vis[i] ==false){
        BFS(graph, V, vis,i);  // Start BFS from node 0

              }
          }
    }
}
