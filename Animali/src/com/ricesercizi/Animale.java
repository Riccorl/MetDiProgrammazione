package com.ricesercizi;

/**
 * Created by Ric on 23/03/16.
 */
public abstract class Animale
{
    protected int zampe;
    protected String verso;
    protected Taglia taglia;

    public enum Taglia
    {
        PICCOLA, MEDIA, GRANDE;
    }

    public Animale(int zampe, Taglia taglia)
    {
        this.zampe = zampe;
        this.taglia = taglia;
    }

    public Animale(int zampe, String verso, Taglia taglia)
    {
        this.zampe = zampe;
        this.verso = verso;
        this.taglia = taglia;
    }

    public String emettiVerso()
    {
        return verso;
    }

    public int getNumeroDiZampe()
    {
        return zampe;
    }

    public Taglia getTaglia()
    {
        return taglia;
    }
}
