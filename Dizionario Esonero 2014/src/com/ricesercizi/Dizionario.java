package com.ricesercizi;

import java.util.Arrays;

/**
 * Created by Ric on 14/03/16.
 */
public class Dizionario
{
    private String[] chiavi = new String[0];
    private int[] valori = new int[0];
    int index;

    public void put(String chiave, int valore)
    {
        String[] nChiavi = Arrays.copyOf(chiavi, index+1);
        int[] nValori = Arrays.copyOf(valori, index+1);

        for (int i = 0; i < chiavi.length; i++) nChiavi[i] = chiavi[i];
        for (int i = 0; i < chiavi.length; i++) nValori[i] = valori[i];

        nChiavi[index] = chiave;
        nValori[index] = valore;
        chiavi = nChiavi;
        valori = nValori;
        index++;
    }

    public int get(String chiave)
    {
        int j = 0;
        for (int i = 0; i < chiavi.length; i++)
            if (chiavi[i] == chiave) j = valori[i];

        return j;
    }

    public void clear()
    {
        for (int i = 0; i < chiavi.length; i++){
            chiavi[i] = "";
            valori[i] = 0;
        }
    }

    public String toString()
    {
        String s = "{ ";
        for (int i = 0; i < chiavi.length; i++)
            s += chiavi[i]+"="+valori[i]+", ";

        return s += " }";
    }
}
