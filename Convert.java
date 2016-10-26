package com.ricesercizi;

/**
 * Created by Ric on 10/03/16.
 */
public class Convert
{
    private String str;

    public Convert(String str)
    {
        this.str = str;
    }

    /**
     * Converte le cifre in lettere
     * @return stringa stringaNumeri con le cifre convertite
     */
    public String convert2String()
    {
        String stringaNumeri = "";
        for (int i = 0; i < str.length(); i++)
        {
            switch (str.charAt(i))
            {
                case '0': stringaNumeri += "zero "; break;
                case '1': stringaNumeri += "uno "; break;
                case '2': stringaNumeri += "due "; break;
                case '3': stringaNumeri += "tre "; break;
                case '4': stringaNumeri += "quattro "; break;
                case '5': stringaNumeri += "cinque "; break;
                case '6': stringaNumeri += "sei "; break;
                case '7': stringaNumeri += "sette "; break;
                case '8': stringaNumeri += "otto "; break;
                case '9': stringaNumeri += "nove "; break;
            }
        }

        return stringaNumeri;
    }

    /**
     * Converte in cifre le parole
     * @return stringa stringaNumeri con le parole convertite
     */
    public String convert2Num()
    {
        String stringaNumeri = "";
        String[]  numSplit = str.split(" ");
        for (int i = 0; i < numSplit.length; i++)
        {
            switch (numSplit[i]) {
                case "zero": stringaNumeri += "0"; break;
                case "uno": stringaNumeri += "1"; break;
                case "due": stringaNumeri += "2"; break;
                case "tre": stringaNumeri += "3"; break;
                case "quattro": stringaNumeri += "4"; break;
                case "cinque": stringaNumeri += "5"; break;
                case "sei": stringaNumeri += "6"; break;
                case "sette": stringaNumeri += "7"; break;
                case "otto": stringaNumeri += "8"; break;
                case "nove": stringaNumeri += "9"; break;
            }
        }

        return stringaNumeri;
    }

}
