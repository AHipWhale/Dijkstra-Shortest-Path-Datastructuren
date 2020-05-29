package Algoritme;

public class Vlucht extends Stap implements Comparable<Vlucht>{
    public int prijs;
    public double bagageKwijt;
    public double nieuwePrijs;

    public Vlucht(int prs, int bk, Node node) {
        prijs = prs;
        bagageKwijt = bk;
        bestemming = node;
    }

    public void setNieuwePrijs() {
//      Op deze manier heeft het percentage dat je bagage kwijt kan raken ook nog invloed op de uitkomst
        nieuwePrijs = prijs*(1.0+(bagageKwijt/100));
    }

    @Override
    public int getMeeting() {
        setNieuwePrijs();
        return (int) nieuwePrijs;
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
