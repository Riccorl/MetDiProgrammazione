package com.riclab;

/**
 * Created by Ric on 04/03/16.
 */
public class ContaParola
{

    private String frase;
    private String parola;

    public ContaParola(String frase, String parola)
    {
        this.frase = frase;
        this.parola = parola;
    }

    public int numeroParola()
    {
        int occorezzaParola = 0;
        String[] splitted = frase.split(" ");

        for(int i = 0; i < splitted.length; i++)
        {
            if (parola.equals(splitted[i]))
                occorezzaParola++;
        }

        return occorezzaParola;
    }
}
