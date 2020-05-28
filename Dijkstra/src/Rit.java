public class Rit extends Stap implements Comparable<Rit>{
    public int afstand;

    public Rit(int afnd, Node nod) {
        bestemming = nod;
        afstand = afnd;
    }

    public int getAfstand() {
        return afstand;
    }

    @Override
    public int compareTo(Rit rit) {
        if (rit == this) {
            return 0;
        }
        else if (rit.afstand > this.afstand) {
            return -1;
        }
        else {
            return 1;
        }
    }
}
