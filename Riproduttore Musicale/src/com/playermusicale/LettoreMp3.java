package com.playermusicale;

public class LettoreMp3 extends RiproduttoreMusicale
{
    public void inserisciSupporto(MemUSB s) throws RiproduttorePieno
    {
        super.inserisciSupporto();
        this.s = s;
    }
}
