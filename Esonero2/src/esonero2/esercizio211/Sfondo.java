package esonero2.esercizio211;

public abstract class Sfondo
{
    protected String carattere;

    public Sfondo(String carattere)
    {
        this.carattere = carattere;
    }

    @Override
    public String toString()
    {
        return carattere;
    }
}
