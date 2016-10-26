package com.ricesercizi;

/**
 * Created by Ric on 08/03/16.
 */
public class DivisoreProprio
{

    public String divPropri(int n)
    {
        String elencoDiv = "";

        for (int i = 1; i < n - 1; i++)
        {
            if (n % i == 0)
                elencoDiv += i + ", ";
        }

        return elencoDiv;
    }
    public String divPropriInv(int n)
    {
        String elencoDiv = "";

        for (int i = n-1; i > 1; i--)
        {
            if (n % i == 0)
                elencoDiv += i + ", ";
        }

        return elencoDiv += "1";
    }
}
