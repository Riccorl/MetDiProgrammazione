package assembly;

public class Registro extends Operando
{
    private String nome;

    public Registro(String nome)
    {
        this.nome = nome;
    }

    public int getInterOp()
    {
        return interOp;
    }

    public void setInterOp(int interOp)
    {
        super.interOp = interOp;
    }
}
