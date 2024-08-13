package Graphs;
import java.util.*;

public class Graph_Intro {

    static class Edge {
        int src;
        int dst;

        public Edge(int s, int d) {
            this.src = s;
            this.dst = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        // We need to create an empty ArrayList for each vertex
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding edges
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }

    public static void main(String[] args) {
        int V = 4;

        ArrayList<Edge>[] graph = new ArrayList[V];

        // Initialize and create the graph
        createGraph(graph);

        // Printing 2's neighbors
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.print(e.dst + " ");
        }
    }
}
