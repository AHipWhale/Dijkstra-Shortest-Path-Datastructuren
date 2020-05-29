package Algoritme;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreinritTest {

    @Test
    void getMeeting() {
        Node A = new Node("A");
        Treinrit B = new Treinrit(25, A);
        assertEquals(25, B.getMeeting());
    }
}