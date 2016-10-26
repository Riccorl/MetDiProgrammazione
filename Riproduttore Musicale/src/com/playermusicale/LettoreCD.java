package com.playermusicale;

public class LettoreCD extends RiproduttoreMusicale
{
    public void inserisciSupporto(CompactDisc s) throws RiproduttorePieno
    {
        super.inserisciSupporto();
        this.s = s;
    }
}
