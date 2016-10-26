package assembly;

public class Mov extends Binaria
{
    public Mov(Registro r, Operando o)
    {
        super(r, o);
    }

    @Override
    public void esegui()
    {
        r.setInterOp(o.interOp);
    }

}
