package Algoritme;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//      Rit
        Node rit_nodeA = new Node("A");
        Node rit_nodeB = new Node("B");
        Node rit_nodeC = new Node("C");
        Node rit_nodeD = new Node("D");
        Node rit_nodeE = new Node("E");
        Node rit_nodeF = new Node("F");

        Stap rit_ab = new Rit(10, rit_nodeB);
        Stap rit_ac = new Rit(15, rit_nodeC);
        Stap rit_bd = new Rit(12, rit_nodeD);
        Stap rit_bf = new Rit(15, rit_nodeF);
        Stap rit_ce = new Rit(10, rit_nodeE);
        Stap rit_df = new Rit(1, rit_nodeF);
        Stap rit_de = new Rit(2, rit_nodeE);
        Stap rit_fe = new Rit(5, rit_nodeE);

        rit_nodeA.addDestination(rit_ab);
        rit_nodeA.addDestination(rit_ac);
        rit_nodeB.addDestination(rit_bd);
        rit_nodeB.addDestination(rit_bf);
        rit_nodeC.addDestination(rit_ce);
        rit_nodeD.addDestination(rit_df);
        rit_nodeD.addDestination(rit_de);
        rit_nodeF.addDestination(rit_fe);

        Reis rit = new Reis(rit_nodeA, rit_nodeE, "rit");

//      Treinrit
        Node trein_nodeA = new Node("Amsterdam centraal");
        Node trein_nodeB = new Node("Weesp");
        Node trein_nodeC = new Node("Naarden-Bussum");
        Node trein_nodeD = new Node("Bussum-zuid");
        Node trein_nodeE = new Node("Utrecht-overvecht");
        Node trein_nodeF = new Node("Utrecht centraal");

        Stap trein_ab = new Treinrit(16, trein_nodeB);
        Stap trein_ac = new Treinrit(24, trein_nodeC);
        Stap trein_bd = new Treinrit(9, trein_nodeD);
        Stap trein_bf = new Treinrit(37, trein_nodeF);
        Stap trein_ce = new Treinrit(20, trein_nodeE);
        Stap trein_df = new Treinrit(28, trein_nodeF);
        Stap trein_de = new Treinrit(24, trein_nodeE);
        Stap trein_fe = new Treinrit(4, trein_nodeE);

        trein_nodeA.addDestination(trein_ab);
        trein_nodeA.addDestination(trein_ac);
        trein_nodeB.addDestination(trein_bd);
        trein_nodeB.addDestination(trein_bf);
        trein_nodeC.addDestination(trein_ce);
        trein_nodeD.addDestination(trein_df);
        trein_nodeD.addDestination(trein_de);
        trein_nodeF.addDestination(trein_fe);

        Reis treinRit = new Reis(trein_nodeA, trein_nodeF, "trein");

//      Vlucht
        Node vlucht_nodeA = new Node("Schiphol");
        Node vlucht_nodeB = new Node("Paris-Charles De Gaulle");
        Node vlucht_nodeC = new Node("Aeroport de Palma");
        Node vlucht_nodeD = new Node("Oslo Lufthavn");
        Node vlucht_nodeE = new Node("JF Kennedy airport");
        Node vlucht_nodeF = new Node("Internationale lichthaven Goa");

        Stap vlucht_ab = new Vlucht(78, 10, vlucht_nodeB);
        Stap vlucht_ac = new Vlucht(127, 1,vlucht_nodeC);
        Stap vlucht_bd = new Vlucht(139, 30, vlucht_nodeD);
        Stap vlucht_bf = new Vlucht(623, 99, vlucht_nodeF);
        Stap vlucht_ce = new Vlucht(389, 20, vlucht_nodeE);
        Stap vlucht_df = new Vlucht(489, 15, vlucht_nodeF);
        Stap vlucht_de = new Vlucht(443, 50, vlucht_nodeE);
        Stap vlucht_fe = new Vlucht(1128, 25, vlucht_nodeE);

        vlucht_nodeA.addDestination(vlucht_ab);
        vlucht_nodeA.addDestination(vlucht_ac);
        vlucht_nodeB.addDestination(vlucht_bd);
        vlucht_nodeB.addDestination(vlucht_bf);
        vlucht_nodeC.addDestination(vlucht_ce);
        vlucht_nodeD.addDestination(vlucht_df);
        vlucht_nodeD.addDestination(vlucht_de);
        vlucht_nodeF.addDestination(vlucht_fe);

        Reis vlucht = new Reis(vlucht_nodeA, vlucht_nodeD, "vlucht");
    }
}
