package esonero2.esercizio211;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code her

        Navicella n = new Navicella();

        Alieno a = new Alieno(4, 3);

        ArrayList<Nemico> nemici = new ArrayList<Nemico>();
        nemici.add(a);

        n.setBLaser(true);
        Sparatutto spara = new Sparatutto(n, nemici);
        System.out.println(spara.toString());

        System.out.println();

        n.giu(spara);
        spara.prossimoPasso();
        System.out.println(spara.toString());



    }
}
