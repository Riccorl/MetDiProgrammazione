package com.playermusicale;

public class Mangianastri extends RiproduttoreMusicale
{
    public void inserisciSupporto(Nastro s) throws RiproduttorePieno
    {
        super.inserisciSupporto();
        this.s = s;
    }
}
