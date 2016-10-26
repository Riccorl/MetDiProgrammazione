package com.playermusicale;

import java.util.ArrayList;

public class Nastro extends SupportoModificabile
{
    private static int minuti;
    private final static int CAPIENZA = minuti/5;

    public Nastro(ArrayList<Brano> brani, int minuti)
    {
        super(CAPIENZA, brani);
        this.minuti = minuti;
    }

}
