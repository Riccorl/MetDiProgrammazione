package com.ricesercizi;

import java.util.Arrays;

/**
 * Created by Ric on 14/03/16.
 */
public class Sbarramento
{
    private String[] diz = new String[0];

    public int[] fatt(int n)
    {
        if (n < 0) return new int[0];

        int[] array = new int[n+1];

        for (int i = 0; i < array.length; i++)
            array[i] = fattoriale(i);

        return array;
    }

    private int fattoriale(int n)
    {
        if (n < 1) return 1;
        else return n*fattoriale(n-1);
    }

    public int contaCaratteri(String s, char c)
    {
        int counter = 0;

        if (s != null)
            for (int i = 0; i < s.length(); i++)
                if (s.charAt(i) == c) counter++;

        return counter;
    }

    public int moltiplica(int[] a, int k, int j)
    {
        int n = 0;
        while (k < j)
        {
            n = a[k]*a[k+1];
            k++;
        }

        return n;
    }

    public void string()
    {
        System.out.println(Arrays.toString(diz));
    }
}
