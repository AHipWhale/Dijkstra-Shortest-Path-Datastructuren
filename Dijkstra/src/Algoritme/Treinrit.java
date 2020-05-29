package Algoritme;

public class Treinrit extends Stap implements Comparable<Treinrit>{
    public int tijd;

    public Treinrit(int td, Node nod) {
        bestemming = nod;
        tijd = td;
    }

    public int getMeeting() {
        return tijd;
    }

    @Override
    public int compareTo(Treinrit o) {
        return 0;
    }
}
