package provaAlgo;

public class Algo
{
    private int[] arr;

    public Algo(int[] arr)
    {
        this.arr = arr;
    }

    public int salto()
    {
        int a = 0;
        int b = arr.length-1;
        int i = (a+b)/2;

        while (b != a)
        {
            if (arr[i] > i)
            {
                b = i;
                i = (a+b)/2;
            }

            if (arr[i] == i)
            {
                a = i +1;
                i = (a+b)/2;
            }

        }

        return a;
    }
}
