package successioni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SuccInfinita implements Iterable<Integer>
{
    List<Integer> numeri;

    public SuccInfinita()
    {
        numeri = new ArrayList<>(Arrays.asList(4, 8, 5, 16, 23, 42));
    }

    @Override
    public Iterator<Integer> iterator()
    {
        return new Iterator<Integer>()
        {
            @Override
            public boolean hasNext()
            {
                return ;
            }

            @Override
            public Integer next()
            {
                return null;
            }
        };
    }
}
