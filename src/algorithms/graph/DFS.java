package algorithms.graph;

import java.util.LinkedList;
import java.util.ListIterator;

public class DFS {

    // number of vertices.
    int V;

    // we are representing with adjacency list so every vertex should have a linked List
    //every vertex and store adjacent vertex of that vertex in that list
    LinkedList<Integer> adjList[];


    public DFS(int vertices) {

        this.V = vertices;
        this.adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; ++i) {
            adjList[i] = new LinkedList<>(); //it will create empty list for every node

        }
    }
    void addEdgesToGraph(int v, int u) {

        adjList[v].add(u);
    }
    // depth first traversal is used by depth first search. it will traverse one strong component completely

    void DFSTraversal(int vertices, int[] visited) {

        visited[vertices] = 1;
        System.out.print(vertices + " ");

        ListIterator<Integer> i = adjList[vertices].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (visited[n] == 0) {
                DFSTraversal(n, visited);
            }
        }
    }

    //depth first search will call depth fist traversal on
    // disconnected components. it will keep track of visited[] array.

    void DFSSearch(int vertices) {

        int[] visited = new int[V];
        DFSTraversal(vertices, visited);
        for (int i = 1 ; i < V ; i++) {
            if (visited[i] == 0) {
                DFSTraversal(i, visited);
            }
        }
    }

    public static void main(String[] args) {
        DFS obj = new DFS(10);

        obj.addEdgesToGraph(1,2);
        obj.addEdgesToGraph(1,4);
        obj.addEdgesToGraph(2,5);
        obj.addEdgesToGraph(2,6);
        obj.addEdgesToGraph(4,7);
        obj.addEdgesToGraph(4,8);
        obj.addEdgesToGraph(3,9);
        obj.addEdgesToGraph(3,4);
        obj.addEdgesToGraph(4,3);

        obj.DFSSearch(1);
    }
}
