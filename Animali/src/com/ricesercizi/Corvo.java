package com.ricesercizi;

/**
 * Created by Ric on 24/03/16.
 */
public class Corvo extends Uccello
{
    private static final String VERSO = "Cra Cra";
    private static final Taglia TAGLIA = Taglia.MEDIA;

    public Corvo()
    {
        super(ZAMPE, VERSO, TAGLIA);
    }
}
