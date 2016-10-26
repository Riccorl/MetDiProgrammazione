package com.playermusicale;

import java.util.ArrayList;

public class MemUSB extends SupportoModificabile
{
    private final static int CAPIENZA = 1024;

    public MemUSB(ArrayList<Brano> brani)
    {
        super(CAPIENZA, brani);
    }

}
