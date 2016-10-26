package com.ricesercizi;

/**
 * Created by Ric on 13/03/16.
 */
public class StampaTriangolo
{
    private int n;
    private char carattere = '*';

    public StampaTriangolo(int n)
    {
        this.n = n;
    }

    /**
     * Restituisce un triangolo isoscele di base n in formato stringa
     * @return
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 1;  i <= n; i+=2)
            sb.append(creaRiga(' ', (n-i)/2)).append(creaRiga(carattere, i)).append('\n');

        return sb.toString();
    }

    /**
     * Input: carattere da utilizzare e numero di occorrenze
     * @param carattere
     * @param n
     * @return una stringa contenente n volte il carattere in input
     */
    private String creaRiga(char carattere, int n)
    {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) sb.append(carattere);

        return sb.toString();
    }
}
