package Algoritme;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VluchtTest {

    @Test
    void setNieuwePrijs() {
    }

    @Test
    void getMeeting() {
        Node A = new Node("A");
        Vlucht B = new Vlucht(25, 20, A);
        int prijs = 25;
        double bagageKwijt = 20;
        Double verwacht = prijs*(1.0+(bagageKwijt/100));
        assertEquals(verwacht, B.getMeeting());
    }
}