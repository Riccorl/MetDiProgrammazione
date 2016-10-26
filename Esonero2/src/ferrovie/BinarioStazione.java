package ferrovie;

public class BinarioStazione extends Binario
{
    public BinarioStazione(Binario succ)
    {
        super(succ);
    }

    @Override
    public Binario percorri(Treno t)
    {
        t.entraInStazione();
        return this.succ;
    }
}
