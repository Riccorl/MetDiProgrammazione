package com.ricesercizi;

/**
 * Created by Ric on 23/03/16.
 */
public abstract class Mammifero extends Animale
{
    protected static final int ZAMPE = 4;
    public Mammifero(int zampe, String verso, Taglia taglia)
    {
        super(zampe, verso, taglia);
    }

}
