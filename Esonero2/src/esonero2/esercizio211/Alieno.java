package esonero2.esercizio211;

public class Alieno extends Nemico
{
    public Alieno(int pX, int pY)
    {
        super(pX, pY);
    }

    @Override
    public void prossimoPasso()
    {
        pX-=1;
    }

    @Override
    public String toString()
    {
        return "A";
    }
}
