package com.ricesercizi;

import java.util.Arrays;

/**
 * Created by Ric on 13/03/16.
 */
public class Cruciverba
{
    private int x;
    private int y;

    private int index;
    private char[][] tabella;

    public Cruciverba(int x, int y)
    {
        this.x = x;
        this.y = y;
        tabella = new char[y][x];
    }

    public boolean set(String parola)
    {
        boolean value = false;

        for (int j = 0; j < y; j++)
        {
            if (controlloSpazi(parola, tabella[j]))
            {
                value = true;
                for (int k = 0; k < parola.length(); k++)
                {
                    tabella[j][index] = parola.charAt(k);
                    index++;
                }
                if (index < x) tabella[j][index] = '*';
                break;
            }
        }
        return value;
    }

    public boolean set(String[] a)
    {
        boolean value = false;
        for (int j = 0; j < y; j++)
        {
            for (int k = 0; k < a.length; k++)
            {
                String s = a[k];
                if (controlloSpazi(s, tabella[j]))
                {
                    value = true;
                    for (int i = 0; i < s.length(); i++)
                    {
                        tabella[j][index] = s.charAt(i);
                        index++;
                    }
                    if (index < x) tabella[j][index] = '*';
                    break;
                }
            }
        }

        return value;
    }

    public boolean controlloSpazi(String s, char[] array)
    {
        int spaziVuoti = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == 0) spaziVuoti++;
            if (spaziVuoti == 1) index = i;
        }

       return s.length() < spaziVuoti;
    }

    public String toString()
    {
        return Arrays.deepToString(tabella);
    }

}
