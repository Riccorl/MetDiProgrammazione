package ferrovie;

public class BinarioSemaforo extends Binario
{
    private int durata;
    public BinarioSemaforo(Binario succ, int durata)
    {
        super(succ);
        this.durata = durata;
    }

    @Override
    public Binario percorri(Treno t)
    {
        if (t instanceof TAV) return this.succ;
        else return this;
    }

    public void rosso()
    {
    }


}
