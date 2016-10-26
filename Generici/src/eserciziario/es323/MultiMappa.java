package eserciziario.es323;

import java.util.*;
import java.util.function.Supplier;

public class MultiMappa<K, V>
{
    private Map<K, Collection<V>> multiMappa = new HashMap<>();
    private Supplier<Collection<V>> creaMappa;

    public MultiMappa()
    {
        this(ArrayList::new);
    }

    public MultiMappa(Supplier<Collection<V>> creaMappa)
    {
        this.creaMappa = creaMappa;
    }

    public boolean put(K key, V value)
    {
        multiMappa.putIfAbsent(key, creaMappa.get());
        return multiMappa.get(key).add(value);
    }

    public Collection<V> get(K key)
    {
        if (multiMappa.containsKey(key)) return multiMappa.get(key);
        else return null;
    }

    public boolean contains(K key, V value)
    {
        return multiMappa.containsKey(key) && multiMappa.get(key).contains(value);
    }

    public void intersect(K key, Collection<V> set)
    {
        if (!multiMappa.containsKey(key)) throw new IllegalArgumentException();
        if (set == null) multiMappa.remove(key);
        else multiMappa.get(key).retainAll(set);
    }

    public void intersectMultiMappa(MultiMappa<K, V> mappa2)
    {
        multiMappa.keySet().retainAll(mappa2.getMultiMappa().keySet());
        multiMappa.keySet().forEach(k -> intersect(k, mappa2.get(k)));
    }

    public Map<K, Collection<V>> getMultiMappa()
    {
        return multiMappa;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (K k : multiMappa.keySet())
            sb.append(k).append(": ").append(getMultiMappa().get(k)).append("; ").append('\n');

        return sb.toString();
    }
}
