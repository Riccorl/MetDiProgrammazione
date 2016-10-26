package com.ricesercizi;

/**
 * Created by Ric on 23/03/16.
 */
public class PrelevaDenaro extends Operazione
{
    private double prelevato;
    public PrelevaDenaro(ContoBancario conto, double prelevato)
    {
        super(conto);
        this.prelevato = prelevato;
    }

    @Override
    public void esegui()
    {

        if (prelevato <= conto.denaro)
            conto.denaro -= prelevato;
    }
}
