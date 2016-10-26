package eserciziario.es322;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollezioneCoppie<T extends Comparable<T>>
{
    private class CoppiaInterna <S extends Comparable<S>> implements Comparable<CoppiaInterna<S>>
    {
        private S x;
        private S y;

        public CoppiaInterna(S x, S y)
        {
            this.x = x;
            this.y = y;
        }

        public S getX()
        {
            return x;
        }

        public void setX(S x)
        {
            this.x = x;
        }

        public S getY()
        {
            return y;
        }

        public void setY(S y)
        {
            this.y = y;
        }

        @Override
        public String toString()
        {
            StringBuilder sb = new StringBuilder();
            return sb.append("(").append(x).append(", ").append(y).append(")").toString();
        }

        @Override
        public int compareTo(CoppiaInterna<S> o)
        {
            return getX().compareTo(o.getX());
        }

        @Override
        public boolean equals(Object o)
        {
            if (this == o) return true;
            if (!(o instanceof CoppiaInterna)) return false;

            CoppiaInterna<?> coppiaInterna = (CoppiaInterna<?>) o;

            if (x != null ? !x.equals(coppiaInterna.x) : coppiaInterna.x != null) return false;
            return y != null ? y.equals(coppiaInterna.y) : coppiaInterna.y == null;

        }

        @Override
        public int hashCode()
        {
            int result = x != null ? x.hashCode() : 0;
            result = 31 * result + (y != null ? y.hashCode() : 0);
            return result;
        }
    }

    private Set<CoppiaInterna<T>> set = new HashSet<>();

    public void aggiungi(T x, T y)
    {
        set.add(new CoppiaInterna<>(x, y));
    }

    public void elimina(T x, T y)
    {
        CoppiaInterna<T> coppiaInterna = new CoppiaInterna<>(x, y);
        if (set.contains(coppiaInterna)) set.remove(coppiaInterna);
    }

    public Set<CoppiaInterna<T>> getCoppiaPerX(T x)
    {
        return set.stream().filter(c -> c.getX().equals(x)).collect(Collectors.toCollection(HashSet::new));
    }

    @Override
    public String toString()
    {
        List<CoppiaInterna<T>> setSorted = set.stream().sorted(CoppiaInterna::compareTo).collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();

        for (CoppiaInterna<T> c : setSorted)
            sb.append(c.toString()).append(", ");

        return sb.toString();
    }

}
