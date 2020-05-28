public class Vlucht extends Stap implements Comparable<Vlucht>{
    public int prijs;
    public int bagageKwijt;

    public Vlucht(int prs, int bk, Node node) {
        prijs = prs;
        bagageKwijt = bk;
        bestemming = node;
    }

    @Override
    public int getAfstand() {
        return super.getAfstand();
    }

    @Override
    public int compareTo(Vlucht vlucht) {
        if (vlucht == this) {
            return 0;

        }
        else if (prijs > vlucht.prijs && bagageKwijt > vlucht.bagageKwijt) {
            return -1;

        }
        else {
            return 1;
        }
    }
}
