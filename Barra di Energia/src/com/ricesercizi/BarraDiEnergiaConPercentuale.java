package com.ricesercizi;

/**
 * Created by Ric on 21/03/16.
 */
public class BarraDiEnergiaConPercentuale extends BarraDiEnergia
{
    public BarraDiEnergiaConPercentuale(int k)
    {
        super(k);
    }

    public void incrementaBarra()
    {
        super.incrementaBarra();
    }

    public String toString()
    {
        String s = super.toString();

        double perc = (double)barra/k*100;

        return s += " " + (int)perc + "%";
    }

}
