class adjacenctMatrix {
    private boolean[][] adjacencyMatrix; // A 2D boolean array to store edge information.
    private int numVertices; // The number of vertices in the graph.

    // Initialize the matrix
    public adjacenctMatrix(int numVertices) { // Constructor that initializes the graph with the specified number of vertices.
        this.numVertices = numVertices; // numVertices: Stores the number of vertices in the numVertices field.
        adjacencyMatrix = new boolean[numVertices][numVertices]; // Initializes the adjacency matrix. All elements are initially set to false (no edges).
    }

    // Add edge
    public void addEdge(int i, int j) {
        adjacencyMatrix[i][j] = true;
        adjacencyMatrix[j][i] = true; // For undirected graph
    }

    // Remove edge
    public void removeEdge(int i, int j) {
        adjacencyMatrix[i][j] = false;
        adjacencyMatrix[j][i] = false; // For undirected graph
    }

    // Print the matrix
    public void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjacencyMatrix[i][j] ? 1 : 0);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}



