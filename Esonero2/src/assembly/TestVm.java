package assembly;

public class TestVm
{
    public static void main(String[] args)
    {
        Registro eax = new Registro("EAX");
        System.out.println(eax.interOp);

        Mov mov1 = new Mov(eax, new Intero(2));
        Add add1 = new Add(eax, new Intero(2));
        Cmp cmp1 = new Cmp(eax, new Intero(2));
        mov1.esegui();

        System.out.println(eax.interOp);

        add1.esegui();

        System.out.println(eax.interOp);

        cmp1.esegui();
        System.out.println(eax.interOp);



    }
}
