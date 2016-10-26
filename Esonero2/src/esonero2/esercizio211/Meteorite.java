package esonero2.esercizio211;

public class Meteorite extends Nemico
{
    public Meteorite(int pX, int pY)
    {
        super(pX, pY);
    }

    @Override
    public void prossimoPasso()
    {
        pX-=1;
        pY+=1;
    }

    @Override
    public String toString()
    {
        return "M";
    }
}
