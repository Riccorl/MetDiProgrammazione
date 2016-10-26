package com.ricesercizi;

/**
 * Created by Ric on 08/03/16.
 */
public class ContaVocali
{

    public String getVocals(String str)
    {
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        String nVocals;

        for (int k = 0; k < str.length(); k++)
        {
            switch (str.charAt(k))
            {
                case 'a': a++; break;
                case 'e': e++; break;
                case 'i': i++; break;
                case 'o': o++; break;
                case 'u': u++; break;
                default: break;
            }
        }

        return  nVocals = "a=" + a + " e=" + e + " i=" + i + " o=" + o + " u=" + u;
    }
}
