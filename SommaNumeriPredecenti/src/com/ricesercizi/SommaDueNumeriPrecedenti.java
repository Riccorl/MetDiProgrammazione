package com.ricesercizi;

/**
 * Created by Ric on 10/03/16.
 */
public class SommaDueNumeriPrecedenti
{
    private int a;
    private int b;
    private int n;

    public SommaDueNumeriPrecedenti(int a, int b, int n)
    {
        this.a = a;
        this.b = b;
        this.n = n;
    }

    public String sommaNumeri()
    {
        String str = a + ", " + b + ", ";
        for (int i = 0; i < n; i++)
        {
            int somma = a + b;
            a = b;
            b = somma;

            str = str + somma + ", ";
        }

        return str;
    }
}
