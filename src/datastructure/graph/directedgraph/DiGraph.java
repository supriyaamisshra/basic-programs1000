package datastructure.graph.directedgraph;

import datastructure.graph.Edge;

import java.util.ArrayList;
import java.util.List;

public class DiGraph {

    List<List<Integer>> adj = new ArrayList<>();

    public DiGraph(List<Edge> edges) {

        for (int i = 0; i <edges.size() ; i++) {
            adj.add(i, new ArrayList<>());
        }

        for (Edge current : edges ) {
            adj.get(current.src).add(current.dest);

            // in case of uniDirected
            //adj.get(current.dest).add(current.src);
            
        }
    }

    public  void printGraph() {
        int src = 0;
        int n = this.adj.size();

        while (src < n ){
            for (int dest : this.adj.get(src)) {
                System.out.print("(" + src + "-->" + dest +")\t") ;

            }
            src++;
            System.out.println();
        }
    }
}
