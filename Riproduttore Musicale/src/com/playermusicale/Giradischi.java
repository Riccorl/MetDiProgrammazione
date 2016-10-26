package com.playermusicale;

public class Giradischi extends RiproduttoreMusicale
{

    public void inserisciSupporto(Disco33 s) throws RiproduttorePieno
    {
        super.inserisciSupporto();
        this.s = s;
    }

    public void inserisciSupporto(Disco45 s) throws RiproduttorePieno
    {
        super.inserisciSupporto();
        this.s = s;
    }
}
