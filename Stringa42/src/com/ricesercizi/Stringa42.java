package com.ricesercizi;

public class Stringa42
{

    private String stringa;

    public Stringa42(String s1, String s2, String s3)
    {
        // Concatena le stringhe
        stringa = s1.concat(" ").concat(s2).concat(" ").concat(s3);

        // Limita lunghezza stringa a 42
        if (stringa.length() > 42)
            stringa = stringa.substring(0, 42);
    }

    public String getStringa()
    {
        return stringa;
    }

    public char getPrimoCarattere()
    {
        return stringa.charAt(0);
    }

    public boolean bIsMagic()
    {
        return stringa.equals("42");
    }

    public boolean bThereSMagic()
    {
        return stringa.indexOf("42") != -1;
    }

    public static void main(String[] args) {

        Stringa42 s = new Stringa42("La risposta", "è", "42");

        System.out.println(s.getStringa());
        System.out.println(s.getPrimoCarattere());
        System.out.println(s.bIsMagic());
        System.out.println(s.bThereSMagic());
    }

}
