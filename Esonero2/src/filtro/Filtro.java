package filtro;

import java.util.List;

public abstract class Filtro
{
    protected List<Integer> l;

    public class NessunaLista extends Exception{}

    public Filtro(){}

    public Filtro(List<Integer> l)
    {
        this.l = l;
    }

    abstract List<Integer> filtra() throws NessunaLista;
    abstract List<Integer> filtra(List<Integer> l);
}
