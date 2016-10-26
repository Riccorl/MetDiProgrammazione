package successioni;

import java.util.Iterator;

public class Quadrato implements Successione, Iterable<Integer>
{
    private int n;

    public Quadrato(int n)
    {
        this.n = n;
    }

    @Override
    public Iterator<Integer> iterator()
    {
        return new Iterator<Integer>()
        {
            @Override
            public boolean hasNext()
            {
                return true;
            }

            @Override
            public Integer next()
            {
                int i = n;
                n++;
                return i*i;
            }
        };
    }
}
