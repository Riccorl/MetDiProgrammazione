package eserciziario.es324;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MultiInsieme<T>
{
    private List<T> lista;

    public MultiInsieme()
    {
        lista = new ArrayList<>();
    }

    public boolean add(T t)
    {
        boolean presente = false;
        if (lista.contains(t)) presente = true;
        lista.add(t);
        return presente;
    }

    public int get(T t)
    {
        return (int) lista.stream().filter(t::equals).count();
    }

    public boolean contains(T t)
    {
        return lista.contains(t);
    }

    public Set<T> toSet()
    {
        return lista.stream().collect(Collectors.toSet());
    }

    public void intersect(MultiInsieme<T> multi2)
    {
        lista.retainAll(multi2.getLista());
    }

    public List<T> getLista()
    {
        return lista;
    }

    @Override
    public String toString()
    {
        return lista.toString();
    }
}
