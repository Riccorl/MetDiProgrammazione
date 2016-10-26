package com.playermusicale;

import java.util.ArrayList;

public abstract class Supporto
{
    private int capienza;
    protected ArrayList<Brano> brani;

    public class MemPienaExc extends Exception{}

    public Supporto(int capienza, ArrayList<Brano> brani)
    {
        this.capienza = capienza;
        this.brani = new ArrayList<>();
        for (int i = 0; i < capienza || i < brani.size(); i++)
            this.brani.add(brani.get(i));
    }

    public ArrayList<Brano> getBrani()
    {
        return brani;
    }
}
