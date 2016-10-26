package com.ricesercizi;

/**
 * Created by Ric on 24/03/16.
 */
public class Passero extends Uccello
{
    private static final String VERSO = "Cip Cip";
    private static final Taglia TAGLIA = Taglia.PICCOLA;

    public Passero()
    {
        super(ZAMPE, VERSO, TAGLIA);
    }
}
