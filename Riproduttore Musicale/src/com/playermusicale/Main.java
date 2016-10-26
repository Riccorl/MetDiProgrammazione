package com.playermusicale;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws RiproduttoreMusicale.RiproduttorePieno, Supporto.MemPienaExc
    {
        // write your code here


        Brano b1 = new Brano("Dio Lurido", "Cazzomenedellapasqua");
        Brano b2 = new Brano("Dio Lurido", "Mio figlio è un coglione");
        Brano b3 = new Brano("Dio Lurido", "Me so bombato la Madonna");
        Brano b4 = new Brano("Pecorella", "Sono un arrosticino");
        Brano b5 = new Brano("Pecorella", "Non merito la brace");

        ArrayList<Brano> brani1 = new ArrayList<>();
        ArrayList<Brano> brani2 = new ArrayList<>();
        ArrayList<Brano> brani3 = new ArrayList<>();
        brani3.add(0, b1);
        brani3.add(1, b2);
        brani3.add(2, b3);

        MemUSB mem1 = new MemUSB(brani1);
        MemUSB mem2 = new MemUSB(brani2);


        Disco33 disco1 = new Disco33(brani3);


        LettoreMp3 player1 = new LettoreMp3();

        try
        {
            player1.inserisciSupporto(mem1);
        } catch (RiproduttoreMusicale.RiproduttorePieno ripdoduttorePieno)
        {
            ripdoduttorePieno.toString();
        }



        player1.play(b1);
        System.out.println(player1.getBrano());
        System.out.println(player1.toString());
        player1.prev();
        System.out.println(player1.getBrano());
        System.out.println(player1.toString());
    }
}
