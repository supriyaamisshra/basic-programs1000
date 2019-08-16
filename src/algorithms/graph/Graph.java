package algorithms.graph;

import java.util.Iterator;
import java.util.LinkedList;

/****
 * Graph implementation
 *  represents a directed graph using adjacency list representation
 *
 * Breadth-first search is an algorithm for traversing or searching tree or graph data structures.
 * It starts at the tree root, and explores all of the neighbor nodes at the
 * present depth prior to moving on to the nodes at the next depth level.
 *
 */


public class Graph {

    private int V;
    private LinkedList<Integer> adj[];


    public Graph(int v) {
        V = v;
        adj =  new LinkedList[v];

        for (int i = 0; i <v  ; i++) {
            adj[i] = new LinkedList<>();
        }

    }
    // Function to add an edge into the graph
    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }

    void bfs(int s) {
        // to track the visited nodes; default false
        boolean[] visited = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.println("Element "+ s);

            Iterator<Integer> i = adj[s].listIterator();

            while (i.hasNext()) {
                int n = i.next();
                while (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.bfs(2);
    }

}
