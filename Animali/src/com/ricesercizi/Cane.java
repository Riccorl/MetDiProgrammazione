package com.ricesercizi;

/**
 * Created by Ric on 24/03/16.
 */
public abstract class Cane extends Mammifero
{
    protected static final String VERSO = "Bau";

    public Cane(int zampe, String verso, Taglia taglia)
    {
        super(zampe, verso, taglia);
    }
}
