
public class Libro implements statoLettura
{
    private String titolo;
    private String autore;
    private boolean bLetto;


    @Override
    public boolean isLetto()
    {
        return bLetto;
    }

    public void leggi()
    {
        bLetto = true;
    }

    public String getTitolo()
    {
        return titolo;
    }

    public String getAutore()
    {
        return autore;
    }
}
