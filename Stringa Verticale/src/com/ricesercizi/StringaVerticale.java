package com.ricesercizi;


public class StringaVerticale
{
    String str;

    public StringaVerticale(String str)
    {
        this.str = str;
    }

    // Ritorna una stringa in verticale
    public String stampaVer()
    {
        String vertical = "";

        for (int i = 0; i < str.length(); i++ )
        {
            String s = Character.toString(str.charAt(i));
            vertical = vertical + s + '\n';
        }

        return vertical;
    }
}
