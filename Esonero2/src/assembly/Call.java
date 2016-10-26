package assembly;

public class Call implements Istruzione
{
    private Procedura p;

    public Call(Procedura p)
    {
        this.p = p;
    }

    @Override
    public void esegui()
    {
        p.esegui();
    }
}
