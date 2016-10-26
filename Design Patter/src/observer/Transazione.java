package observer;

public class Transazione
{
    private String compagnia;
    private double importo;

    public Transazione(String compagnia, double importo)
    {
        this.compagnia = compagnia;
        this.importo = importo;
    }

    public String getCompagnia()
    {
        return compagnia;
    }

    public double getImporto()
    {
        return importo;
    }
}
