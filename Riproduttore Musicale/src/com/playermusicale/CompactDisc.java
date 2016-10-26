package com.playermusicale;

import java.util.ArrayList;

public class CompactDisc extends Supporto
{
    private final static int CAPIENZA = 20;

    public CompactDisc(ArrayList<Brano> brani)
    {
        super(CAPIENZA, brani);
    }
}
