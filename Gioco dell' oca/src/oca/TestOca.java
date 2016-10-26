package oca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TestOca
{
    public static void main(String[] args)
    {
        List<Giocatore> gs = new ArrayList<>(Arrays.asList(
                new Giocatore(),
                new Giocatore(),
                new Giocatore(),
                new Giocatore(),
                new Giocatore()
        ));

        GiocoDellOca gioco1 = new GiocoDellOca(30, gs);
        System.out.println(gioco1.toStringTab());
        System.out.println(gioco1.toStringPos());




    }
}
