package filtro;

import java.util.ArrayList;
import java.util.List;

public class FiltroIntero extends Filtro
{
    private int k;

    public FiltroIntero(int k)
    {
        this.k = k;
    }

    public FiltroIntero(List<Integer> l, int k)
    {
        super(l);
        this.k = k;
    }

    @Override
    public List<Integer> filtra() throws NessunaLista
    {
        if (l == null) throw new NessunaLista();
        return filtra(this.l);
    }

    @Override
    public List<Integer> filtra(List<Integer> l)
    {
        List<Integer> lFiltrato = new ArrayList<>();
        for (int i : l)
            if (i != k) lFiltrato.add(i);

        return lFiltrato;
    }
}
