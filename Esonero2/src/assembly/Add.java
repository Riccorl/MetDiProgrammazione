package assembly;

public class Add extends Binaria
{
    public Add(Registro r, Operando o)
    {
        super(r, o);
    }

    @Override
    public void esegui()
    {
        r.interOp += o.interOp;
    }
}
