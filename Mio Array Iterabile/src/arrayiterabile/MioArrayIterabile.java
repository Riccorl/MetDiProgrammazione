package arrayiterabile;

import java.util.Iterator;

public class MioArrayIterabile implements Iterable<Integer>
{
    private int[] a;

    public class MyIterator implements Iterator<Integer>
    {
        private int k;

        @Override
        public boolean hasNext()
        {
            return k < a.length;
        }

        @Override
        public Integer next()
        {
            return hasNext() ? a[k++] : null;
        }
    }

    public MioArrayIterabile(int[] a)
    {
        this.a = a;
    }

    @Override
    public Iterator<Integer> iterator()
    {
        return new MyIterator();
    }
}
