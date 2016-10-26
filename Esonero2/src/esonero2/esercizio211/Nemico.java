package esonero2.esercizio211;

public abstract class Nemico
{
    protected int pX;
    protected int pY;

    public Nemico(int pX, int pY)
    {
        this.pX = pX;
        this.pY = pY;
    }

    public abstract void prossimoPasso();
}
