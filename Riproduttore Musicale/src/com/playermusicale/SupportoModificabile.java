package com.playermusicale;

import java.util.ArrayList;

public class SupportoModificabile extends Supporto
{
    private int capienza;
    private int count;

    public SupportoModificabile(int capienza, ArrayList<Brano> brani)
    {
        super(capienza, brani);
    }

    public void addBrano(int k, Brano b) throws MemPienaExc
    {
        if (count >= capienza) throw new MemPienaExc();
        brani.add(k, b);
        count++;
    }
}
