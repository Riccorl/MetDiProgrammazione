package multimappagen;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MultiMappa<T, S> //implements Iterable<MultiMappa.Elemento>
{
    private Map<T, Collection<S>> map = new HashMap<>();
    private Supplier<Collection<S>> nuovoMetodo;
    /*
    static public class Elemento<T, S>
    {
        private T chiave;
        private S valore;
        private Elemento<T, S> next;

        public Elemento(T chiave, S valore, Elemento<T, S> next)
        {
            this.chiave = chiave;
            this.valore = valore;
            this.next = next;
        }

        public T getChiave()
        {
            return chiave;
        }

        public S getValore()
        {
            return valore;
        }

        public Elemento<T, S> getNext()
        {
            return next;
        }
    }

    public class Iteratore implements Iterator<Elemento>
    {
        private Iterator iterChiavi = MultiMappa.this.map.keySet().iterator();
        private Iterator iterVal;

        public Iteratore()
        {
            this.iterVal = ;
        }

        @Override
        public boolean hasNext()
        {

            return iterChiavi.hasNext() && iterVal != null;
        }

        @Override
        public Elemento next()
        {
            if ()
        }
    }
    */

    public MultiMappa()
    {
        this(ArrayList::new);
    }

    public MultiMappa(Supplier<Collection<S>> nuovoMetodo)
    {
        this.nuovoMetodo = nuovoMetodo;
    }

    public void put(T t, S s)
    {
        map.putIfAbsent(t, nuovoMetodo.get());
        map.get(t).add(s);
    }

    public Collection<S> get(T t)
    {
        return map.get(t);
    }

    public Set<S> get(T t, Predicate<S> p)
    {
        if (map.get(t) == null) return null;
        return map.get(t).stream()
                         .filter(p)
                         .collect(Collectors.toCollection(HashSet<S>::new));
    }

    public List<S> values()
    {
        /*
        List<S> lista = new ArrayList<>();
        map.values().forEach(lista::addAll);
        return lista;
        */

        return map.values().stream().flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public Set<S> valuesSet()
    {
        return new HashSet<>(values());
    }

    /*
    public MultiMappa<T, S> traformToMultiMappa()
    {

    }
    */

    /*
    @Override
    public Iterator<Elemento> iterator()
    {
        return new Iteratore();
    }
    */

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (T t : map.keySet())
            sb.append(t).append(" -> ").append(map.get(t).toString());

        return sb.toString();
    }

}
