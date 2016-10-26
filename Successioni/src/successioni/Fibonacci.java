package successioni;

import java.util.Iterator;

public class Fibonacci implements Iterable<Integer>
{
    private int fib1;
    private int fib2 = 1;

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
                int fib = fib1 + fib2;

                fib1 = fib2;
                fib2 = fib;
                return fib1;
            }
        };
    }
}
