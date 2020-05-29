package Algoritme;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RitTest {

    @Test
    void getMeeting() {
        Node A = new Node("A");
        Rit B = new Rit(10, A);
        assertEquals(10, B.getMeeting());
    }
}