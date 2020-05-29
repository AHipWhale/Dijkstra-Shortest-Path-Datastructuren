package Algoritme;

import java.util.*;

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

    public void addDestination(Stap stap) {
        adjacentNodes.put(stap.bestemming, stap.getMeeting());
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

    public void addToShortestPath(Node node) {
        shortestPath.add(node);
    }

    public List<Node> getShortestPath() {
        return shortestPath;
    }
}
