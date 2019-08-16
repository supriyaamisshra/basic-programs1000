package datastructure.graph.declaration;

public class GraphAdjacencyMatrix {

    private  boolean adjMatrix[][];
    private  int vertexCount;


    public GraphAdjacencyMatrix(boolean[][] adjMatrix, int vertexCount) {
        this.adjMatrix = new boolean[vertexCount][vertexCount];
        this.vertexCount = vertexCount;
    }

    private void addEdge(int i, int j) {

        if (i >= 0 && i < vertexCount && j > 0 && j < vertexCount) {
            adjMatrix[i][j] = true;
            adjMatrix[j][i] = true;
        }
    }

    private void removeEdge(int i, int j) {

        if (i >= 0 && i < vertexCount && j > 0 && j < vertexCount) {
            adjMatrix[i][j] = false;
            adjMatrix[j][i] = false;
        }
    }
    private boolean isEdge(int i, int j) {

        if (i >= 0 && i < vertexCount && j > 0 && j < vertexCount) {
            return adjMatrix[i][j];
        } else {
            return false;
        }
    }

}
