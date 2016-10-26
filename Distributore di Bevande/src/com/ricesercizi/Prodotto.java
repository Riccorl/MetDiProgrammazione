package com.ricesercizi;

/**
 * Created by Ric on 21/03/16.
 */
public abstract class Prodotto
{
    protected double prezzo;
    protected int codice;

    public Prodotto(double prezzo, int codice)
    {
        this.prezzo = prezzo;
        this.codice = codice;
    }
}
