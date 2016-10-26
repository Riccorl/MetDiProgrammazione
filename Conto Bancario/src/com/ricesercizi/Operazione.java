package com.ricesercizi;

/**
 * Created by Ric on 23/03/16.
 */
public abstract class Operazione
{
    protected ContoBancario conto;

    public Operazione(ContoBancario conto)
    {
        this.conto = conto;
    }
    public abstract void esegui();
}
