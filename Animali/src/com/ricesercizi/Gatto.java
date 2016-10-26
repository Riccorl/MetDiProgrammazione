package com.ricesercizi;

/**
 * Created by Ric on 23/03/16.
 */
public class Gatto extends Felino
{
    private static final String VERSO = "miao";
    private static final Taglia TAGLIA = Taglia.PICCOLA;

    public Gatto()
    {
        super(ZAMPE, VERSO, TAGLIA);
    }
}
