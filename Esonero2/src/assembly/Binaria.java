package assembly;

public abstract class Binaria implements Istruzione
{
    protected Registro r;
    protected Operando o;

    public Binaria(Registro r, Operando o)
    {
        this.r = r;
        this.o = o;
    }


}
