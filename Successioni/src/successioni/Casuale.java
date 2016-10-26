package successioni;

import java.util.Iterator;
import java.util.Random;

public class Casuale implements Iterable<Integer>
{
    private int n;

    public Casuale(int n)
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
                Random random = new Random();
                return random.nextInt()*n - n/2;
            }
        };
    }
}
