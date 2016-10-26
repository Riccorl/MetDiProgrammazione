package com.ricesercizi;

/**
 * Created by Ric on 01/03/16.
 */
public class Rettangolo
{
    private int x, y, base, altezza;

    public Rettangolo(int xValue, int yValue, int baseValue, int altezzaValue)
    {
        x = xValue;
        y = xValue;
        base = baseValue;
        altezza = altezzaValue;
    }


    public String trasla(int traslaX, int traslaY )
    {
        int xt = x + traslaX;
        int yt = y + traslaY;

        String traslato = "(" + xt + ", " + yt + ")";

        return traslato;
    }

    public String toString()
    {
        int x2 = x + base;
        int y2 = y - altezza;

        String datiRettangolo = "(" + x + ", " + y + ")->(" + x2 + ", " + y2 + ")";

        return datiRettangolo;
    }
}
