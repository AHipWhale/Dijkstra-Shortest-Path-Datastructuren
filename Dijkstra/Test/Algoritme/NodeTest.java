package Algoritme;

import org.junit.jupiter.api.Test;

import java.util.*;


import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void getNaam() {
        Node A = new Node("A");
        assertEquals("A", A.getNaam());
    }

    @Test
    void addDestination() {
        Map<Node, Integer> adjacentNodes = new Hashtable<>();
        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");

        Stap ab = new Rit(10, B);
        Stap ac = new Rit(15, C);

        A.addDestination(ab);
        A.addDestination(ac);

        Map<Node, Integer> TestDict = new Hashtable<>();
        TestDict.put(ab.bestemming, ab.getMeeting());
        TestDict.put(ac.bestemming, ac.getMeeting());
        assertEquals(TestDict, A.getAdjacentNodes());
    }

    @Test
    void getAdjacentNodes() {
        Map<Node, Integer> adjacentNodes = new Hashtable<>();
        Node A = new Node("A");
        Node B = new Node("B");
        Stap ab = new Rit(10, B);
        A.addDestination(ab);

        Map<Node, Integer> TestDict = new Hashtable<>();
        TestDict.put(ab.bestemming, ab.getMeeting());
        assertEquals(TestDict, A.getAdjacentNodes());
    }

    @Test
    void setDistance() {
        Node A = new Node("A");
        A.setDistance(5);
        assertEquals(5, A.getDistance());
    }

    @Test
    void getDistance() {
        Node B = new Node("B");
        B.setDistance(50000);
        assertEquals(50000, B.getDistance());
    }

    @Test
    void setShortestPath() {
        Node A = new Node("A");
        Node B = new Node("B");
        List<Node> testLijst = new LinkedList<>();
        testLijst.add(B);
        A.setShortestPath(testLijst);
        assertEquals(testLijst, A.getShortestPath());
    }

    @Test
    void addToShortestPath() {
        Node A = new Node("A");
        Node B = new Node("B");

        List<Node> testLijst = new LinkedList<>();
        testLijst.add(B);
        A.addToShortestPath(B);
        assertEquals(testLijst, A.getShortestPath());
    }

    @Test
    void getShortestPath() {
        Node A = new Node("A");
        Node B = new Node("B");

        List<Node> testLijst = new LinkedList<>();
        testLijst.add(B);
        A.addToShortestPath(B);
        assertEquals(testLijst, A.getShortestPath());
    }
}