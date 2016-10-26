package provaAlgo;

public class TestAlgo
{
    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 7, 8, 9, 10, 11, 12, 13};
        Algo algo = new Algo(a);

        System.out.println(algo.salto());
    }
}
