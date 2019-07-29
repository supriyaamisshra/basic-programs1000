package datastructure.graph.directedgraph;

import datastructure.graph.Edge;

import java.util.Arrays;
import java.util.List;

public class Main {



    public static void main (String[] args)
    {
        // Input: List of edges in a directed graph (as per above diagram)
        List<Edge> edges = Arrays.asList(new Edge(0, 1), new Edge(1, 2),
                new Edge(2, 0), new Edge(2, 1),new Edge(3, 2),
                new Edge(4, 5), new Edge(5, 4));

        // construct graph from given list of edges
        DiGraph graph = new DiGraph(edges);

        // print adjacency list representation of the graph
        graph.printGraph();
    }
}
