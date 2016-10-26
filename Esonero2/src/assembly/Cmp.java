package assembly;

public class Cmp extends Binaria
{
    public Cmp(Registro r, Operando o)
    {
        super(r, o);
    }

    @Override
    public void esegui()
    {
        if (r.interOp == o.interOp) r.setInterOp(0);
        if (r.interOp > o.interOp) r.setInterOp(1);
        if (r.interOp < o.interOp) r.setInterOp(-1);
    }

}
