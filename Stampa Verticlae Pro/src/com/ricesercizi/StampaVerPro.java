package com.ricesercizi;

/**
 * Created by Ric on 05/03/16.
 */
public class StampaVerPro
{
    private String str1;
    private String str2;
    private String str3;

    public StampaVerPro(String str1, String str2, String str3)
    {
        this.str1 = str1;
        this.str2 = str2;
        this.str3 = str3;
    }

    // Ritorna 3 stringhe in verticale
    public String stampaVerPro()
    {
        String vertical = "";
        int length = Math.max(str1.length(), Math.max(str2.length(), str3.length()));

        for (int i = 0; i < length; i++)
        {
            String s = getChar(str1, i) + getChar(str2, i) + getChar(str3, i);
            vertical += s + '\n';
        }

        return vertical;
    }

    public String getChar(String stringIn, int k)
    {
        String stringOut;

        if (k < stringIn.length())
           stringOut = Character.toString(stringIn.charAt(k));
        else
            stringOut = " ";

        return stringOut;
    }
}

