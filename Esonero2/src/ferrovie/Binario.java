package ferrovie;

public abstract class Binario
{
    protected Binario succ;

    public Binario(Binario succ)
    {
        this.succ = succ;
    }

    public abstract Binario percorri(Treno t);

    public Binario getSucc()
    {
        return succ;
    }
}
