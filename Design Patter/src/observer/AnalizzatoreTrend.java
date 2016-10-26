package observer;

public class AnalizzatoreTrend extends Analizzatore
{
    private Transazione ultimaTransazione;
    private double trendImporto;

    @Override
    public void analizza(Transazione t)
    {
        if (ultimaTransazione == null) trendImporto = t.getImporto();
        else trendImporto = t.getImporto() - ultimaTransazione.getImporto();

        ultimaTransazione = t;
    }
}
