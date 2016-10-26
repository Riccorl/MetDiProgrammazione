package com.ricesercizi;

/**
 * Created by Ric on 21/03/16.
 */
public class BarraDiEnergia
{
    protected int k;
    protected int barra;

    public BarraDiEnergia(int k)
    {
        this.k = k;
    }

    public void incrementaBarra()
    {
        this.barra += 1;
    }

    public String toString()
    {
        StringBuilder barra = new StringBuilder();

        for (int i = 0; i < this.barra; i++)
            barra.append('O');
        for (int j = 0; j < k - this.barra; j++)
            barra.append('=');

        return barra.toString();
    }

}
