package com.ricesercizi;

/**
 * Created by Ric on 13/03/16.
 */
public class Cornice
{
    private int n;
    private static char carattere = '*';
    private String str;

    public Cornice(int n)
    {
        this(n, null);
    }

    public Cornice(int n, String str)
    {
        this.n = n;
        this.str = str;
    }


    /**
     * Restituisce un rettangolo di '*' contenente, eventualmente, una Stringa
     * @return
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(creaRiga(carattere, carattere, n));

        if (str != null)
        {
            for (int i = 0, j = 0; i < n-2; i++, j += n-2)
            {
                if (j < str.length()) sb.append(creaRigaTesto(carattere, str.substring(j), n));
                else sb.append(creaRiga(carattere, ' ', n));
            }
        }
        else
            for(int i = 0; i < n-2; i++) sb.append(creaRiga(carattere, ' ', n));

        return sb.append(creaRiga(carattere, carattere, n)).toString();

    }

    /**
     * Restituisce una stringa che racchiude tra il primo carattere in input n volte
     * il secondo carattere in input
     * @param carattere1
     * @param carattere2
     * @param n
     * @return
     */
    private String creaRiga(char carattere1, char carattere2, int n)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(carattere1);

        for(int i = 0; i < n-2; i++)
        {
            sb.append(carattere2);
        }

        return sb.append(carattere1).append('\n').toString();
    }

    /**
     * Restituisce una stringa che racchiude tra il carattere in input una Stringa
     * @param carattere1
     * @param str
     * @param n
     * @return
     */
    private String creaRigaTesto(char carattere1, String str, int n)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(carattere1);

        for (int i = 0; i < n-2; i++)
        {
            if (i < str.length()) sb.append(str.charAt(i));
            else sb.append(' ');
        }

        return sb.append(carattere1).append('\n').toString();
    }

}
