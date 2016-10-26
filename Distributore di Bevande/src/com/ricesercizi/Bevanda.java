package com.ricesercizi;

/**
 * Created by Ric on 21/03/16.
 */
public enum Bevanda
{
    CAFFE(0.40),
    CAPPUCCINO(0.70),
    CIOCCOLATO(0.80),
    NCAZZU(0.0);

    private double codice;

    Bevanda(double codice)
    {
        this.codice = codice;
    }

    public double toDouble()
    {
        return codice;
    }
}
