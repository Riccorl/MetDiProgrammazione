package esercizio353;

public class TestOrdina
{
    public static void main(String[] args)
    {
        Sequenza seq = new Sequenza();

        BubbleSort bs = new BubbleSort();

        seq.setAlgoritmoDiOrdinamento(bs);

        seq.oridna();
    }
}
