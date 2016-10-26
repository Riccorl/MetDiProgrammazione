package ferrovie;

public class MyArray
{
    private int[] a;


    public MyArray(int ... interi)
    {
        a = interi;

    }

    public int[] getA()
    {
        return a;
    }

    @Override
    public String toString()
    {
        String s = "";
        for (int i = 0; i<a.length;i++)
            s += a[i]+", ";

        return s;
    }
}
