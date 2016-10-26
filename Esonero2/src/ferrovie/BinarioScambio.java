package ferrovie;

public class BinarioScambio extends Binario
{
    private Binario succ2;

    public BinarioScambio(Binario succ, Binario succ2)
    {
        super(succ);
        this.succ2 = succ2;
    }

    public void scambia()
    {
        Binario appoggio = succ;
        succ = succ2;
        succ2 = appoggio;
    }

    @Override
    public Binario percorri(Treno t)
    {
        return this.succ;
    }
}
