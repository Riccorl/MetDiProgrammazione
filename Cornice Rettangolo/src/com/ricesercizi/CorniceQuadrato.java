package com.ricesercizi;

/**
 * Created by Ric on 12/03/16.
 */
public class CorniceQuadrato
{
    private int n;
    private static char carattere = '*';

    public CorniceQuadrato(int n)
    {
        this.n = n;
    }

    public String creaCornice()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(creaRiga(carattere, carattere, n));

        for (int i = 0; i < n-2; i++) sb.append(creaRiga(carattere, ' ', n));

        return sb.append(creaRiga(carattere, carattere, n)).toString();

    }

    private String creaRiga(char carattere1, char carattere2, int n)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(carattere1);

        for(int i = 0; i < n-2; i++) sb.append(carattere2);

        return sb.append(carattere1).append('\n').toString();
    }
}