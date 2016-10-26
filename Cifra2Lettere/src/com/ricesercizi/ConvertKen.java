package com.ricesercizi;

/**
 * Created by Ric on 11/03/16.
 */
public class ConvertKen
{
    private String str;

    private String array09[] = {"zero", "uno", "due", "tre", "quattro", "cinque", "sei", "sette", "otto", "nove"};
    private String array1119[] = {"dieci", "undici", "dodici", "tedici", "quattordici", "quindici", "sedici", "diciassette", "diciotto", "diciannove"};
    private String array1090[] = {"dieci", "venti", "trenta", "quaranta", "cinquanta", "sessanta", "settanta", "novanta"};
    private String cento = "cento";
    private String mille = "mille";


    private String parola = "";

    public ConvertKen(String str)
    {
        this.str = str;
    }


    public String convertKen2Letter()
    {

        for (int i = 0; i < str.length(); i++)
        {
            if (str.length() == 1)
                parola = array09[getPosizione(0)];

            else if (str.length() == 2)
            {
                if (str.charAt(0) == '1')
                    parola = array1119[getPosizione(1)];
                else
                {
                    if (str.charAt(1) == '0')
                        parola = array1090[getPosizione(0)-1];
                    else
                        parola = array1090[getPosizione(0)-1] + array09[getPosizione(1)];
                }
            }

            else if (str.length() == 3)
            {
                if (str.charAt(1) == '0')
                {
                    if (str.charAt(2) == '0')
                        parola = array09[getPosizione(0)] + cento;
                    else
                        parola = array09[getPosizione(0)] + cento + array09[getPosizione(2)];
                }
                else if (str.charAt(2) == '0')
                    parola = array09[getPosizione(0)] + cento + array1090[getPosizione(1)-1];

                else
                    parola = array09[getPosizione(0)] + cento + array1090[getPosizione(1)-1] + array09[getPosizione(2)];
            }

            else
            {
                
            }
        }

        return parola;
    }

    /**
     * Prende in input @param indice della stringa
     * @return un intero utile per prelevare la cifra dall' array
     */
    private int getPosizione(int indice)
    {
        int posizione = Integer.parseInt(Character.toString(str.charAt(indice)));

        return posizione;
    }
}
