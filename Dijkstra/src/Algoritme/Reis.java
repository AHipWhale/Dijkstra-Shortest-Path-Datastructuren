package Algoritme;

public class Reis {
    public Reis(Node begin, Node eind, String vervoer) {
        Graph graph = new Graph();
        graph = Graph.calculateShortestPathFromSource(graph, begin);
        eind.addToShortestPath(eind);

//      Voor elke soort reis een andere print statement
        if (vervoer.equals("rit")) {
            int afstand = eind.getDistance();
            System.out.println("De rit was "+ afstand +" kilometer:");
        }
        else if (vervoer.equals("trein")) {
            int tijd = eind.getDistance();
            System.out.println("De treinrit was "+ tijd +" minuten:");
        }
        else {
            System.out.println("De beste vlucht is:");
        }
        for (Node i : eind.getShortestPath()) {
            System.out.println(i.getNaam());
        }

//      Deze (lege) print is om ervoor te zorgen dat de prints wat overzichtelijker zijn
        System.out.println();
    }
}
