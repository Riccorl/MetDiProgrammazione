package com.ricesercizi;


public class CashRegister
{
    private double change;
    private double total;

    public CashRegister()
    {
        change = 0;
        total = 0;
    }

    /**
     * Somma il prezzo dei prodotti
     * @param price
     */
    public void getPrice(double price)
    {
        total += price;
    }

    /**
     * @return il totale da pagare
     */
    public double getTotal()
    {
        return total;
    }

    /**
     * @param customerCash
     * @return Ritorna il resto dovuto
     */
    public String getChange(double customerCash)
    {
        String resto = "Resto dovuto: ";
        String manca = "Restante da pagare: ";

        if (customerCash > total)
        {
            change = (customerCash - total);
            resto += change;
            return resto;
        }
        else
        {
            double debito = Math.abs(customerCash - total);
            return manca += debito;
        }

    }

}
