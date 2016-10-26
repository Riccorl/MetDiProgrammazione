package com.ricesercizi;

import java.util.Arrays;

/**
 * Created by Ric on 23/03/16.
 */
public class Filtro
{
    private int[] startArray;

    public Filtro(int[] startArray)
    {
        this.startArray = startArray;
    }

    public int[] passaBasso(int k)
    {
        int j = 0;
        int[] temp = new int[startArray.length];

        for (int i = 0; i < startArray.length; i++)
        {
            if (startArray[i] <= k)
            {
                temp[j] = startArray[i];
                j++;
            }
        }

        return temp = Arrays.copyOf(temp, j);
    }

    public int[] passaAlto(int k)
    {
        int j = 0;
        int[] temp = new int[startArray.length];

        for (int i = 0; i < startArray.length; i++)
        {
            if (startArray[i] >= k)
            {
                temp[j] = startArray[i];
                j++;
            }
        }

        return temp = Arrays.copyOf(temp, j);
    }

    public int[] filtra(int k)
    {
        int j = 0;
        int[] filtrato = new int[startArray.length];

        for (int i = 0; i < startArray.length; i++)
        {
            if (startArray[i] != k)
            {
                filtrato[j] = startArray[i];
                j++;
            }
        }

        return startArray = Arrays.copyOf(filtrato, j);
    }

    public int[] filtra(int[] a)
    {
        int[] filtrato = {};

        for (int i = 0; i < a.length; i++)
        {
            filtrato = filtra(a[i]);
        }

        return startArray = filtrato;
    }
}
