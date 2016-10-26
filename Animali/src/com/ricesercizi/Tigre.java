package com.ricesercizi;

/**
 * Created by Ric on 23/03/16.
 */
public class Tigre extends Felino
{
    private static final String VERSO = "Roar";
    private static final Taglia TAGLIA = Taglia.GRANDE;

    public Tigre()
    {
        super(ZAMPE, VERSO, TAGLIA);
    }
}
