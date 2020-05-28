import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Node {
    private String naam;
    private Map<Node, Integer> adjacentNodes;
    private List<Node> shortestPath = new LinkedList<>();
    private Integer distance = Integer.MAX_VALUE;

    public Node(String nm) {
        naam = nm;
        adjacentNodes = new Hashtable<>();
    }

    public String getNaam() {
        return naam;
    }

    public void addDestination(Node destination, int distance) {
        adjacentNodes.put(destination, distance);
    }

    public Map<Node, Integer> getAdjacentNodes() {
        return adjacentNodes;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setShortestPath(List<Node> shortestPath) {
        this.shortestPath = shortestPath;
    }

    public List<Node> getShortestPath() {
        return shortestPath;
    }
}
