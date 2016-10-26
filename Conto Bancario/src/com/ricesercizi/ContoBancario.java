package com.ricesercizi;

/**
 * Created by Ric on 23/03/16.
 */
public class ContoBancario
{
    private String iban;
    private static double denaro;

    public ContoBancario(String iban, double denaro)
    {
        this.iban = iban;
        this.denaro = denaro;
    }

    public String getIban()
    {
        return iban;
    }

    public double getDenaro()
    {
        return denaro;
    }
}
