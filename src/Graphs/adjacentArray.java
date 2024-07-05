import java.util.LinkedList;
import java.util.List;

public class adjacentArray {
    private List<List<Integer>> adjacenctList;


    //intialize the list
    public adjacentArray(int numVertices){
        adjacenctList = new LinkedList<>();     
        for(int i=0; i<numVertices; i++) {
            adjacenctList.add(new LinkedList<>());
        }
    }

    //add edge

    public void add(int i, int j){
        adjacenctList.get(i).add(j);
        adjacenctList.get(j).add(i); //undirected Graph
    }

    //Print the graph

    public void printGraph(){
        for(int i=0; i<adjacenctList.size(); i++){
            System.out.println("Vertex" + i + ":");

            for(Integer vertex : adjacenctList.get(i)){
                System.out.println("->" + vertex);
            }
            System.out.println();
        }
        
    }

    public void addEdge(int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addEdge'");
    }
}
