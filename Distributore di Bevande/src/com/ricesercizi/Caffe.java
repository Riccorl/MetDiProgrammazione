package com.ricesercizi;

/**
 * Created by Ric on 21/03/16.
 */
public class Caffe extends Prodotto
{
    private static final int codice = 1;
    private static final double prezzo = 0.40;

    public Caffe()
    {
        super(prezzo, codice);
    }

    public int getCodice()
    {
        return codice;
    }

    public double getPrezzo()
    {
        return prezzo;
    }
}
