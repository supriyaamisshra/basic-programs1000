package datastructure.graph.declaration;

import datastructure.stackimplementation.LinkedListNode;

import java.util.ArrayList;
import java.util.LinkedList;

public class AdjacencyListGraph
{

    private ArrayList<Integer> vertices;
    private ListNode[] edges;
    private int vertexCount = 0;

    public AdjacencyListGraph(int vertexCount) {
        this.vertexCount = vertexCount;
        this.vertices = new ArrayList<>();
        this.edges = new ListNode[vertexCount];

        for (int i = 0; i < vertexCount ; i++) {
            vertices.add(i);
            edges[i] = new ListNode();

        }

    }
    public void addEdge(int source, int destination) {
        int i = vertices.indexOf(source);
        int j = vertices.indexOf(destination);

        if (i != -1 || j != -1) {
            edges[i].insertAtBeginnig(destination);
            edges[j].insertAtBeginnig(source);
        }

    }
}
