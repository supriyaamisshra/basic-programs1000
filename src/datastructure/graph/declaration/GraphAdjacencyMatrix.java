package datastructure.graph.representation;

public class GraphAdjacencyMatrix {

    private  static boolean adjMatrix[][];
    private  static int vertexCount;


    public GraphAdjacencyMatrix(boolean[][] adjMatrix, int vertexCount) {
        this.adjMatrix = new boolean[vertexCount][vertexCount];
        this.vertexCount = vertexCount;
    }

    private static void addEdge(int i, int j) {

        if (i >= 0 && i < vertexCount && j > 0 && j < vertexCount) {
            adjMatrix[i][j] = true;
            adjMatrix[j][i] = true;
        }
    }

    private static void removeEdge(int i, int j) {

        if (i >= 0 && i < vertexCount && j > 0 && j < vertexCount) {
            adjMatrix[i][j] = false;
            adjMatrix[j][i] = false;
        }
    }
    private static boolean isEdge(int i, int j) {

        if (i >= 0 && i < vertexCount && j > 0 && j < vertexCount) {
            return adjMatrix[i][j];
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        
    }

}
