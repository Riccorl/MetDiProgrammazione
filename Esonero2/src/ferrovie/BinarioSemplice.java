package ferrovie;

public class BinarioSemplice extends Binario
{
    public BinarioSemplice(Binario succ)
    {
        super(succ);
    }

    @Override
    public Binario percorri(Treno t)
    {
        return this.succ;
    }

}
