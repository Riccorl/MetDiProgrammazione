package com.ricesercizi;

/**
 * Created by Ric on 09/03/16.
 */
public class StringaVerticaleProf
{
    private String[] stringhe;

    public StringaVerticaleProf(String[] stringhe)
    {
        this.stringhe = stringhe;
    }

    public void draw()
    {
        int pos = 0;
        int stringheFatte = 0;

        do
        {
            for (int k = 0; k < stringhe.length; k++)
            {
                int len = stringhe[k].length();
                char c = ' ';
                if (pos < len) c = stringhe[k].charAt(pos);
                if (pos == len) stringheFatte++;
                System.out.println(c);
            }
            // Manda a capo
            System.out.println();
            pos++;

        } while (stringheFatte < stringhe.length);
    }
}
