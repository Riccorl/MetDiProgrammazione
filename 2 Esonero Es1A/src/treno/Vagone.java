package treno;

public abstract class Vagone
{
    protected int capienza;
    protected int postiOccupati;
    protected String destinazione;
    protected String tipo;

    public class VagonePieno extends Exception{}

    public Vagone(int capienza)
    {
        this.capienza = capienza;
    }

    public void occupa(Passeggero p) throws VagonePieno
    {
        if (postiOccupati == capienza) throw new VagonePieno();
        postiOccupati++;
        System.out.println("Passeggero" + p.getNome() + " registrato");
    }

    public int getNumeroPostiLiberi()
    {
        return capienza-postiOccupati;
    }

    public void setDestinazione(String destinazione)
    {
        this.destinazione = destinazione;
    }

    public String getTipo()
    {
        return tipo;
    }
}
